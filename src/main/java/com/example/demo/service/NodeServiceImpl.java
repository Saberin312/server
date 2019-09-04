package com.example.demo.service;

import com.example.demo.dao.NodeRepository;
import com.example.demo.entity.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.GeneratedValue;
import java.util.List;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 20:08 2019/9/4
 *@Modified By:
 */

@Service
public class NodeServiceImpl implements NodeService {

    @Autowired
    NodeRepository nodeRepository;

    @Override
    public List<Node> findAll() {
        return nodeRepository.findAll();
    }

    @Override
    public Node insertByNode(Node node) {
        return nodeRepository.save(node);
    }

    @Override
    public Node update(Node node) {
        return nodeRepository.save(node);
    }

    @Override
    public Node delete(Integer id) {
        Node node = nodeRepository.findById(id).get();
        nodeRepository.delete(node);
        return node;
    }

    @Override
    public Node findById(Integer id) {
        return nodeRepository.findById(id).get();
    }
}
