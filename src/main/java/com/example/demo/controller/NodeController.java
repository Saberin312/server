package com.example.demo.controller;

import com.example.demo.entity.Node;
import com.example.demo.service.NodeService;
import org.omg.CORBA.NO_IMPLEMENT;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/***
 *@Author:BHR
 *@Description: Node控制层
 *@Date:Created in 19:59 2019/9/4
 *@Modified By:
 */

@RestController
@RequestMapping(value = "/node")

public class NodeController {
    @Autowired
    NodeService nodeService;

    public static final String NODE_FORM_PATH_NAME = "nodeForm";
    public static final String NODE_LIST_PATH_NAME = "nodeList";
    public static final String REDIRECT_TO_NODE_URL = "redirect:/node";


    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String getNodelist(ModelMap map) {
/**
* @Author:BHR
* @Description: 获取node列表
* @Date:2019/9/4 20:43
*/
        map.addAttribute("nodelist", nodeService.findAll());
        return NODE_LIST_PATH_NAME;
    }

    public String createNodeForm(ModelMap map) {
    /**
    * @Author:BHR
    * @Description: 创建Node表单
    * @Date:2019/9/4 20:47
    */
        map.addAttribute("node", new Node());
        map.addAttribute("action", "create");
        return NODE_FORM_PATH_NAME;


    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String postNode(@ModelAttribute Node node) {
        /**
        * @Author:BHR
        * @Description: 创建book 处理/node/create请求新建node信息
         * @ModelAttribute绑定表单实体参数，也可通过@RequesrPram传参
        * @Date:2019/9/4 20:51
        */
        nodeService.insertByNode(node);
        return REDIRECT_TO_NODE_URL;
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String getNode(@PathVariable Integer id, ModelMap map) {
        /**
        * @Author:BHR
        * @Description: 获取更新 Book 表单
         *      *    处理 "/book/update/{id}" 的 GET 请求，通过 URL 中的 id 值获取 Book 信息
         *      *    URL 中的 id ，通过 @PathVariable 绑定参数
        * @Date:2019/9/4 21:00
        */
        map.addAttribute("node", nodeService.findById(id));
        map.addAttribute("action", "update");
        return NODE_FORM_PATH_NAME;
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public String putNode(@ModelAttribute Node node) {
        nodeService.update(node);
        return REDIRECT_TO_NODE_URL;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteNode(@PathVariable Integer id) {
        nodeService.delete(id);
        return REDIRECT_TO_NODE_URL;
    }



}
