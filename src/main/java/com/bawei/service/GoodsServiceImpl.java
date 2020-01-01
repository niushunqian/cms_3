package com.bawei.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.bean.Brand;
import com.bawei.bean.Condition;
import com.bawei.bean.Goods;
import com.bawei.bean.Kind;
import com.bawei.dao.GoodsDao;


@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsDao dao;

	@Override
	public List<Goods> list(Condition con) {
		
		return dao.list(con);
	}

	@Override
	public void delete(String gid) {
		dao.delete(gid);
		
	}

	@Override
	public List<Brand> selectBrand() {
		
		return dao.selectBrand();
	}

	@Override
	public List<Kind> selectKind() {
		
		return dao.selectKind();
	}

	@Override
	public boolean add(Goods goods) {
		
		return dao.add(goods);
	}

	@Override
	public Goods selectGoods(Integer gid) {
		
		return dao.selectGoods(gid);
	}

	@Override
	public boolean upd(Goods goods) {
		
		return dao.upd(goods);
	}
}
