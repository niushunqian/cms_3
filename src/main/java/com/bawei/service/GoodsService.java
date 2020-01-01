package com.bawei.service;

import java.util.List;

import com.bawei.bean.Brand;
import com.bawei.bean.Condition;
import com.bawei.bean.Goods;
import com.bawei.bean.Kind;

public interface GoodsService {

	List<Goods> list(Condition con);

	void delete(String gid);

	List<Brand> selectBrand();

	List<Kind> selectKind();

	boolean add(Goods goods);

	Goods selectGoods(Integer gid);

	boolean upd(Goods goods);

}
