package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TushuguanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TushuguanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TushuguanView;


/**
 * 图书馆
 *
 * @author 
 * @email 
 * @date 2023-03-02 20:42:22
 */
public interface TushuguanService extends IService<TushuguanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TushuguanVO> selectListVO(Wrapper<TushuguanEntity> wrapper);
   	
   	TushuguanVO selectVO(@Param("ew") Wrapper<TushuguanEntity> wrapper);
   	
   	List<TushuguanView> selectListView(Wrapper<TushuguanEntity> wrapper);
   	
   	TushuguanView selectView(@Param("ew") Wrapper<TushuguanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TushuguanEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<TushuguanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<TushuguanEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<TushuguanEntity> wrapper);



}

