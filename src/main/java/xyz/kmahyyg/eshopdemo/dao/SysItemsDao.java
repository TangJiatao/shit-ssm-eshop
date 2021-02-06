package xyz.kmahyyg.eshopdemo.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.kmahyyg.eshopdemo.model.SysItems;

import java.util.List;

/**
 * @Entity xyz.kmahyyg.model.SysItems
 */
@Mapper
public interface SysItemsDao {
    int deleteByCateId(String cid);
    int deleteById(Integer id);
    int insert(SysItems record);
    List<SysItems> selectByCateId(String cid);
    List<SysItems> selectByShopOwnerId(String shopOwnerId);
    List<SysItems> selectByItemName(String itemName);
    SysItems selectById(Integer id);
    int updateByIdSelective(SysItems record);
}