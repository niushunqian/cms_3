package com.bawei.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bawei.bean.Brand;
import com.bawei.bean.Condition;
import com.bawei.bean.Goods;
import com.bawei.bean.Kind;
import com.bawei.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class GoodsController {
	@Autowired
	private GoodsService service;
	
	@RequestMapping("list.do")
	public String list(Model m,Condition con) {
		if(con.getPageNum()==null) {
			con.setPageNum(1);
		}
		PageHelper.startPage(con.getPageNum(), 2);
		List<Goods> list=service.list(con);
		PageInfo<Goods> page=new PageInfo<Goods>(list);
		m.addAttribute("list", list);
		m.addAttribute("page", page);
		m.addAttribute("con", con);
		return "list";
	}
	@ResponseBody
	@RequestMapping("delete.do")
	public void delete(String gid) {
		service.delete(gid);
	}
	@ResponseBody
	@RequestMapping("selectBrand.do")
	public List<Brand> selectBrand(){
		List<Brand> list=service.selectBrand();
		return list;
	}
	@ResponseBody
	@RequestMapping("selectKind.do")
	public List<Kind> selectKind(){
		List<Kind> list=service.selectKind();
		return list;
	}
	@ResponseBody
	@RequestMapping("add.do")
	public Object add(Goods goods) {
		boolean flag=service.add(goods);
		return flag;
	}
	@ResponseBody
	@RequestMapping("selectGoods.do")
	public Goods selectGoods(Integer gid) {
		Goods goods=service.selectGoods(gid);
		return goods;
	}
	@ResponseBody
	@RequestMapping("upd.do")
	public Object upd(Goods goods) {
		boolean flag=service.upd(goods);
		return flag;
	}

}
