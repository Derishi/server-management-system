package com.company.servermanagementsystem.businessmethods;

import com.company.servermanagementsystem.businessobjects.ServerVO;
import com.company.servermanagementsystem.memorymap.ServerVOList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ServerRESTImpl {

    private static ServerVOList serverVOList = ServerVOList.getInstance();

    public static Collection<ServerVO> findServerById(String serverId) {
        List<String> serverIds = Arrays.asList(serverId.split(","));

        return serverVOList.findServersById(serverIds);
    }

}
