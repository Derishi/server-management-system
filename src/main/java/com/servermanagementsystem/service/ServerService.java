package com.servermanagementsystem.service;

import com.servermanagementsystem.domain.ServerVO;

import java.util.Collection;

public interface ServerService {
    Collection<ServerVO> retrieveServer(String id);
    void createServer(String name, String region, String customer);
    void updateServer(String id, String name, String region, String customer);
    void deleteServer(String id);
}