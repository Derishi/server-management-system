package com.company.servermanagementsystem.memorymap;

import com.company.servermanagementsystem.businessobjects.ServerVO;

import java.util.ArrayList;

public class ServerVOList {

    private ArrayList<ServerVO> serverVOList;

    public ServerVOList() {
        serverVOList.add(new ServerVO("1", "Test ServerVO", "NA", "John Doe"));
        serverVOList.add(new ServerVO("2", "Device Load Servers", "NA", "Pear Inc."));
        serverVOList.add(new ServerVO("3", "The Ocho", "NA", "EZPZ"));
        serverVOList.add(new ServerVO("4", "Eggo Containment Services", "NA", "Jane"));
    }

    // Finds ServerVO by Specified ID
    public ServerVO findServerById(String id) {
        for(ServerVO serverVO : serverVOList) {
            if (serverVO.getId().equals(id)) {
                return serverVO;
            }
        }

        return null;
    }

    // Finds Servers by comma deliminated ids and returns a list
    public ArrayList<ServerVO> findServersById(ArrayList<String> listOfIds) {
        ArrayList<ServerVO> foundServers = new ArrayList<ServerVO>();

        for(String id : listOfIds) {
            ServerVO foundServer = findServerById(id);
            if (foundServer != null) {
               foundServers.add(foundServer);
            }
        }

        return foundServers;
    }

    public void createServer(String name, String region, String customer) {
        serverVOList.add(new ServerVO(String.valueOf(serverVOList.size() + 1), name, region, customer));
    }

    public void updateServer(String id, String name, String region, String customer) {
        //Find ServerVO
        ServerVO server = findServerById(id);

        server.setName(name);
        server.setRegion(region);
        server.setCustomer(customer);
    }

    public void deleteServer(String id) {
        //Hard Delete First
        ServerVO server = findServerById(id);
        serverVOList.remove(server);
    }
}
