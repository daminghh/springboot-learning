package com.web.controller;

import com.util.service.impl.GitReadServiceImpl;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/util")
public class ModuleTestController {
    private GitReadServiceImpl gitReadService;
    @RequestMapping("/read_git")
    public String test(){
        return gitReadService.readGitFile();
    }
}
