package com.company.servermanagementsystem.service;

import com.company.servermanagementsystem.businessobjects.ServerVO;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/servers/")
public class ServerRESTController {

    @RequestMapping(method = RequestMethod.GET)
    public Collection<ServerVO> getServers(@PathVariable String serverId) {
        // this.validateUser(userId); //Implement
        return ServerRESTImpl.findServerById(serverId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createServer(@PathVariable String name, @PathVariable String region, @PathVariable String customer) {
        // this.validateUser(userId); //Implement
    }

    @RequestMapping(method = RequestMethod.POST)
    public void updateServer(@PathVariable String serverId, @PathVariable String name, @PathVariable String region, @PathVariable String customer) {
        // this.validateUser(userId); //Implement
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void updateServer(@PathVariable String serverId) {
        // this.validateUser(userId); //Implement
    }

    /*
    @RequestMapping(method = RequestMethod.POST)
    ResponseEntity<?> add(@PathVariable String userId, @RequestBody Bookmark input) {
        this.validateUser(userId);

        return this.accountRepository
                .findByUsername(userId)
                .map(account -> {
                    Bookmark result = bookmarkRepository.save(new Bookmark(account,
                            input.uri, input.description));

                    URI location = ServletUriComponentsBuilder
                            .fromCurrentRequest().path("/{id}")
                            .buildAndExpand(result.getId()).toUri();

                    return ResponseEntity.created(location).build();
                })
                .orElse(ResponseEntity.noContent().build());

    }
    */

    /*
    @RequestMapping(method = RequestMethod.POST)
    ResponseEntity<?> add(@PathVariable String userId, @RequestBody Bookmark input) {
        this.validateUser(userId);

        return this.accountRepository
                .findByUsername(userId)
                .map(account -> {
                    Bookmark result = bookmarkRepository.save(new Bookmark(account,
                            input.uri, input.description));

                    URI location = ServletUriComponentsBuilder
                            .fromCurrentRequest().path("/{id}")
                            .buildAndExpand(result.getId()).toUri();

                    return ResponseEntity.created(location).build();
                })
                .orElse(ResponseEntity.noContent().build());

    }
    */
}