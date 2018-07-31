package com.demo.api.Resource;

import com.demo.api.response.Response;
import com.demo.api.response.Responses;
import com.demo.domain.model.FlagModel;
import com.demo.domain.service.FlagService;
import com.demo.domain.util.HttpUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FlagResource {

    @Resource
    private FlagService flagService;
    private static int flag = -1;
    private final static Logger logger = LoggerFactory.getLogger(FlagResource.class);

    @GetMapping("/man")
    public Response Manipulate(@RequestParam("flag") Integer flag) {
        logger.info("invoke manipulate{}: e4", flag);
        this.flagService.setFlagData(flag);
        return Responses.successResponse();
    }

    @Scheduled(cron = "5 * * * * *")
    public void GetHome() {
        logger.info("invoke home{}");
        final String url = "http://172.25.122.197:8080/";

        FlagModel model = this.flagService.getFlagDataLatest();
        if (model.getFlag() == flag)
            return ;
        flag = model.getFlag();
        if (flag == 1) {
            HttpUtil.get(url + "1");
        }
        if (flag == 2) {
            HttpUtil.get(url + "2");
        }
        if (flag == 3) {
            HttpUtil.get(url + "3");
        }
        if (flag == 4) {
            HttpUtil.get(url + "4");
        }
    }
}
