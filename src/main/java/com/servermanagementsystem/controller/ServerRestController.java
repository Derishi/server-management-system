package com.servermanagementsystem.controller;

import com.servermanagementsystem.domain.ServerVO;
import com.servermanagementsystem.service.ServerService;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

@RestController
@RequestMapping("/servers")
public class ServerRestController {

    private ServerService serverService;

    public ServerRestController(ServerService serverService){
        this.serverService = serverService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Collection<ServerVO> retrieveServer(@RequestParam(value="id") String id) {
        return serverService.retrieveServer(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createServer(@RequestParam String name, @RequestParam String region, @RequestParam String customer) {
        serverService.createServer(name, region, customer);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void updateServer(@RequestParam String id, @RequestParam String name, @RequestParam String region, @RequestParam String customer) {
        serverService.updateServer(id, name, region, customer);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteServer(@RequestParam String id) {
        serverService.deleteServer(id);
    }
}