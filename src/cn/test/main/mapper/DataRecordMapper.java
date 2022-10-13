package cn.test.main.mapper;

import cn.test.main.domain.DataRecord;

public interface DataRecordMapper {
    /**
     * @mbg.generated
     */
    int deleteByPrimaryKey(String uuid);
    /**
     * @mbg.generated
     */
    int insert(DataRecord row);
    /**
     * @mbg.generated
     */
    int insertSelective(DataRecord row);
    /**
     * @mbg.generated
     */
    DataRecord selectByPrimaryKey(String uuid);
    /**
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DataRecord row);
    /**
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(DataRecord row);
    /**
     * @mbg.generated
     */
    int updateByPrimaryKey(DataRecord row);
}