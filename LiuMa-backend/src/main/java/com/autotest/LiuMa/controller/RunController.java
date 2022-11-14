package com.autotest.LiuMa.controller;

import com.autotest.LiuMa.database.domain.Task;
import com.autotest.LiuMa.request.RunRequest;
import com.autotest.LiuMa.service.RunService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("")
public class RunController {

    @Resource
    private RunService runService;

    @PostMapping("/autotest/run")
    public Task run(@RequestBody RunRequest runRequest, HttpServletRequest request) {
        String user = request.getSession().getAttribute("userId").toString();
        runRequest.setRunUser(user);
        return runService.run(runRequest);
    }
    /**
     * 不用权限就能创建任务
     * @param runRequest
     * @param request
     * @return
     */
    @GetMapping("/noauth/autotest/run")
    public Task noauthRun(@RequestBody RunRequest runRequest, HttpServletRequest request) {
        return runService.run(runRequest);
    }
}
