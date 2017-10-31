package com.servermanagementsystem.impl;

import com.servermanagementsystem.domain.ServerVO;
import com.servermanagementsystem.service.ServerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Service
public class ServerServiceImpl implements ServerService {

    private static Logger logger = LoggerFactory.getLogger(ServerServiceImpl.class);

    //In-Memory List
    private List<ServerVO> serverVOList = new ArrayList<>();;

    public ServerServiceImpl() {
        init();
    }

    private void init() {
        serverVOList.add(new ServerVO("1", "Test ServerVO", "NA", "John Doe"));
        serverVOList.add(new ServerVO("2", "Device Load Servers", "NA", "Pear Inc."));
        serverVOList.add(new ServerVO("3", "The Ocho", "NA", "EZPZ"));
        serverVOList.add(new ServerVO("4", "Eggo Containment Services", "NA", "Jane"));
    }

    public Collection<ServerVO> retrieveServer(String serverId) {
        logger.info("Retrieving ID(s): {}", serverId);
        List<String> listOfIds = Arrays.asList(serverId.split(","));

        ArrayList<ServerVO> foundServers = new ArrayList<>();

        for(String id : listOfIds) {
            ServerVO foundServer = findServerById(id);
            if (foundServer != null) {
                foundServers.add(foundServer);
            }
        }

        return foundServers;
    }

    public Collection<ServerVO> retrieveServers() {
        return serverVOList;
    }

    public void createServer(String name, String region, String customer) {
        String id = String.valueOf(serverVOList.size() + 1);

        logger.info("Creating server id: {} with data: {}{}{}", id);
        serverVOList.add(new ServerVO(id, name, region, customer));
    }

    public void updateServer(String id, String name, String region, String customer) {
        logger.info("Updating server id: {} with data: {}{}{}", id, name, region, customer);
        ServerVO server = findServerById(id);

        if(!name.trim().isEmpty() && !name.equals("undefined")) {
            server.setName(name);
        }
        if(!region.trim().isEmpty() && !region.equals("undefined")) {
            server.setRegion(region);
        }
        if(!customer.trim().isEmpty() && !customer.equals("undefined")) {
            server.setCustomer(customer);
        }
    }

    public void deleteServer(String id) {
        logger.info("Deleting server id: {}", id);
        ServerVO server = findServerById(id);
        serverVOList.remove(server);
    }

    private ServerVO findServerById(String id) {
        for(ServerVO serverVO : serverVOList) {
            if (serverVO.getId().equals(id)) {
                return serverVO;
            }
        }

        return null;
    }
}
