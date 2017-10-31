package com.company.servermanagementsystem.service;

import com.company.servermanagementsystem.businessmethods.ServerRESTImpl;
import com.company.servermanagementsystem.businessobjects.ServerVO;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/servers")
public class ServerRESTController {

    @RequestMapping(method = RequestMethod.GET)
    public Collection<ServerVO> getServers(@RequestParam(value="id") String id) {
        return ServerRESTImpl.findServerById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createServer(@PathVariable String name, @PathVariable String region, @PathVariable String customer) {
        // this.validateUser(userId); //Implement
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void updateServer(@PathVariable String serverId, @PathVariable String name, @PathVariable String region, @PathVariable String customer) {
        // this.validateUser(userId); //Implement
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void updateServer(@PathVariable String serverId) {
        // this.validateUser(userId); //Implement
    }
}