package com.company.servermanagementsystem.businessmethods;

import com.company.servermanagementsystem.businessobjects.ServerVO;
import com.company.servermanagementsystem.memorymap.ServerVOList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ServerRESTImpl {

    private static ServerVOList serverVOList = ServerVOList.getInstance();

    public static Collection<ServerVO> retrieveAllServers() {
        return serverVOList.retrieveAll();
    }

    public static Collection<ServerVO> findServerById(String serverId) {
        List<String> serverIds = Arrays.asList(serverId.split(","));

        return serverVOList.findServersById(serverIds);
    }

    public static void createServer(String name, String region, String customer) {
        serverVOList.createServer(name, region, customer);
    }

    public static void updateServer(String id, String name, String region, String customer) {
        serverVOList.updateServer(id, name, region, customer);
    }

    public static void deleteServer(String id) {
        serverVOList.deleteServer(id);
    }
}
