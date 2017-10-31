package com.company.servermanagementsystem.memorymap;

import com.company.servermanagementsystem.businessobjects.ServerVO;

import java.util.ArrayList;
import java.util.List;

public class ServerVOList {

    private final static ServerVOList instance = ServerVOList.getInstance();

    private static List<ServerVO> serverVOList = initializeServerVOList();

    public static ServerVOList getInstance(){
        return instance;
    }

    public static List<ServerVO> retrieveAll() {
        return serverVOList;
    }

    // Finds ServerVO by Specified ID
    public static ServerVO findServerById(String id) {
        System.out.println(serverVOList);

        for(ServerVO serverVO : serverVOList) {
            if (serverVO.getId().equals(id)) {
                return serverVO;
            }
        }

        return null;
    }

    // Finds Servers by comma deliminated ids and returns a list
    public static ArrayList<ServerVO> findServersById(List<String> listOfIds) {
        ArrayList<ServerVO> foundServers = new ArrayList<ServerVO>();

        for(String id : listOfIds) {
            ServerVO foundServer = findServerById(id);
            if (foundServer != null) {
               foundServers.add(foundServer);
            }
        }

        return foundServers;
    }

    public static void createServer(String name, String region, String customer) {
        serverVOList.add(new ServerVO(String.valueOf(serverVOList.size() + 1), name, region, customer));
    }

    public static void updateServer(String id, String name, String region, String customer) {
        //Find ServerVO
        ServerVO server = findServerById(id);

        server.setName(name);
        server.setRegion(region);
        server.setCustomer(customer);
    }

    public static void deleteServer(String id) {
        //Hard Delete First
        ServerVO server = findServerById(id);
        serverVOList.remove(server);

        //Debug
        System.out.println(serverVOList);
    }

    private static List<ServerVO> initializeServerVOList() {
        List<ServerVO> initialServerVOList = new ArrayList<>();
        initialServerVOList.add(new ServerVO("1", "Test ServerVO", "NA", "John Doe"));
        initialServerVOList.add(new ServerVO("2", "Device Load Servers", "NA", "Pear Inc."));
        initialServerVOList.add(new ServerVO("3", "The Ocho", "NA", "EZPZ"));
        initialServerVOList.add(new ServerVO("4", "Eggo Containment Services", "NA", "Jane"));

        return initialServerVOList;
    }
}
