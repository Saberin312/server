package com.example.demo.service;

import com.example.demo.entity.Node;

import java.util.List;

/***
 *@Author:BHR
 *@Description:Node业务接口层
 *@Date:Created in 20:10 2019/9/4
 *@Modified By:
 */
public interface NodeService {

    List<Node> findAll();

    Node insertByNode(Node node);

    Node update(Node node);

    Node delete(Integer id);

    Node findById(Integer id);

}
