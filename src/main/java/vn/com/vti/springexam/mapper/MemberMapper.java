package vn.com.vti.springexam.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import vn.com.vti.springexam.entity.Member;
import vn.com.vti.springexam.entity.MemberExample;

public interface MemberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated Sat Sep 10 14:28:05 JST 2022
     */
    long countByExample(MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated Sat Sep 10 14:28:05 JST 2022
     */
    int deleteByExample(MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated Sat Sep 10 14:28:05 JST 2022
     */
    int deleteByPrimaryKey(String memberId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated Sat Sep 10 14:28:05 JST 2022
     */
    int insert(Member record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated Sat Sep 10 14:28:05 JST 2022
     */
    int insertSelective(Member record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated Sat Sep 10 14:28:05 JST 2022
     */
    List<Member> selectByExample(MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated Sat Sep 10 14:28:05 JST 2022
     */
    Member selectByPrimaryKey(String memberId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated Sat Sep 10 14:28:05 JST 2022
     */
    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated Sat Sep 10 14:28:05 JST 2022
     */
    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated Sat Sep 10 14:28:05 JST 2022
     */
    int updateByPrimaryKeySelective(Member record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated Sat Sep 10 14:28:05 JST 2022
     */
    int updateByPrimaryKey(Member record);
}