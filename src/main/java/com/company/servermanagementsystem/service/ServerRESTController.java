package com.company.servermanagementsystem.service;

import com.company.servermanagementsystem.businessmethods.ServerRESTImpl;
import com.company.servermanagementsystem.businessobjects.ServerVO;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/servers")
public class ServerRESTController {

    @RequestMapping("/all")
    public Collection<ServerVO> getServers() {
        return ServerRESTImpl.retrieveAllServers();
    }

    @RequestMapping(method = RequestMethod.GET)
    public Collection<ServerVO> getServers(@RequestParam(value="id") String id) {
        return ServerRESTImpl.findServerById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createServer(@RequestParam String name, @RequestParam String region, @RequestParam String customer) {
        ServerRESTImpl.createServer(name, region, customer);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void updateServer(@RequestParam String id, @RequestParam String name, @RequestParam String region, @RequestParam String customer) {
        ServerRESTImpl.updateServer(id, name, region, customer);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteServer(@RequestParam String id) {
        ServerRESTImpl.deleteServer(id);
    }
}