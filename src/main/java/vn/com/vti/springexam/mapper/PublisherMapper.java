package vn.com.vti.springexam.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import vn.com.vti.springexam.entity.Publisher;
import vn.com.vti.springexam.entity.PublisherExample;

public interface PublisherMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher
     *
     * @mbg.generated Sat Sep 10 14:02:30 JST 2022
     */
    long countByExample(PublisherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher
     *
     * @mbg.generated Sat Sep 10 14:02:30 JST 2022
     */
    int deleteByExample(PublisherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher
     *
     * @mbg.generated Sat Sep 10 14:02:30 JST 2022
     */
    int deleteByPrimaryKey(String publisherId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher
     *
     * @mbg.generated Sat Sep 10 14:02:30 JST 2022
     */
    int insert(Publisher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher
     *
     * @mbg.generated Sat Sep 10 14:02:30 JST 2022
     */
    int insertSelective(Publisher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher
     *
     * @mbg.generated Sat Sep 10 14:02:30 JST 2022
     */
    List<Publisher> selectByExample(PublisherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher
     *
     * @mbg.generated Sat Sep 10 14:02:30 JST 2022
     */
    Publisher selectByPrimaryKey(String publisherId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher
     *
     * @mbg.generated Sat Sep 10 14:02:30 JST 2022
     */
    int updateByExampleSelective(@Param("record") Publisher record, @Param("example") PublisherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher
     *
     * @mbg.generated Sat Sep 10 14:02:30 JST 2022
     */
    int updateByExample(@Param("record") Publisher record, @Param("example") PublisherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher
     *
     * @mbg.generated Sat Sep 10 14:02:30 JST 2022
     */
    int updateByPrimaryKeySelective(Publisher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table publisher
     *
     * @mbg.generated Sat Sep 10 14:02:30 JST 2022
     */
    int updateByPrimaryKey(Publisher record);
}