package com.namnd.springbootmybatisexample.mapper;

import com.namnd.springbootmybatisexample.model.Employees;
import com.namnd.springbootmybatisexample.model.EmployeesExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EmployeesMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.employees
	 * @mbg.generated  Tue Dec 21 22:06:57 ICT 2021
	 */
	long countByExample(EmployeesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.employees
	 * @mbg.generated  Tue Dec 21 22:06:57 ICT 2021
	 */
	int deleteByExample(EmployeesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.employees
	 * @mbg.generated  Tue Dec 21 22:06:57 ICT 2021
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.employees
	 * @mbg.generated  Tue Dec 21 22:06:57 ICT 2021
	 */
	int insert(Employees record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.employees
	 * @mbg.generated  Tue Dec 21 22:06:57 ICT 2021
	 */
	int insertSelective(Employees record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.employees
	 * @mbg.generated  Tue Dec 21 22:06:57 ICT 2021
	 */
	List<Employees> selectByExample(EmployeesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.employees
	 * @mbg.generated  Tue Dec 21 22:06:57 ICT 2021
	 */
	Employees selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.employees
	 * @mbg.generated  Tue Dec 21 22:06:57 ICT 2021
	 */
	int updateByExampleSelective(@Param("record") Employees record, @Param("example") EmployeesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.employees
	 * @mbg.generated  Tue Dec 21 22:06:57 ICT 2021
	 */
	int updateByExample(@Param("record") Employees record, @Param("example") EmployeesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.employees
	 * @mbg.generated  Tue Dec 21 22:06:57 ICT 2021
	 */
	int updateByPrimaryKeySelective(Employees record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.employees
	 * @mbg.generated  Tue Dec 21 22:06:57 ICT 2021
	 */
	int updateByPrimaryKey(Employees record);
}