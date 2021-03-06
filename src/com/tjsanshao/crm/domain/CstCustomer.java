package com.tjsanshao.crm.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class CstCustomer {
	private Long custId;
	private BaseDict baseDictByCustSource;
	private BaseDict baseDictByCustLevel;
	private BaseDict baseDictByCustIndustry;
	private SysUser sysUserByCustUserId;
	private SysUser sysUserByCustCreateId;
	private String custName;
	private String custLinkman;
	private String custPhone;
	private String custMobile;
	private Date custCreatetime;
	// 标识此属性不进行序列化
	// @JSONField(serialize=false)
	private Set saleVisits = new HashSet(0);
	// 标识此属性不进行序列化
	// @JSONField(serialize=false)
	private Set cstLinkmans = new HashSet(0);

	public CstCustomer() {
	}

	public CstCustomer(String custName) {
		this.custName = custName;
	}

	public CstCustomer(BaseDict baseDictByCustSource, BaseDict baseDictByCustLevel, BaseDict baseDictByCustIndustry,
			SysUser sysUserByCustUserId, SysUser sysUserByCustCreateId, String custName, String custLinkman,
			String custPhone, String custMobile, Set saleVisits, Set cstLinkmans) {
		this.baseDictByCustSource = baseDictByCustSource;
		this.baseDictByCustLevel = baseDictByCustLevel;
		this.baseDictByCustIndustry = baseDictByCustIndustry;
		this.sysUserByCustUserId = sysUserByCustUserId;
		this.sysUserByCustCreateId = sysUserByCustCreateId;
		this.custName = custName;
		this.custLinkman = custLinkman;
		this.custPhone = custPhone;
		this.custMobile = custMobile;
		this.saleVisits = saleVisits;
		this.cstLinkmans = cstLinkmans;
	}

	public Long getCustId() {
		return this.custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public BaseDict getBaseDictByCustSource() {
		return this.baseDictByCustSource;
	}

	public void setBaseDictByCustSource(BaseDict baseDictByCustSource) {
		this.baseDictByCustSource = baseDictByCustSource;
	}

	public BaseDict getBaseDictByCustLevel() {
		return this.baseDictByCustLevel;
	}

	public void setBaseDictByCustLevel(BaseDict baseDictByCustLevel) {
		this.baseDictByCustLevel = baseDictByCustLevel;
	}

	public BaseDict getBaseDictByCustIndustry() {
		return this.baseDictByCustIndustry;
	}

	public void setBaseDictByCustIndustry(BaseDict baseDictByCustIndustry) {
		this.baseDictByCustIndustry = baseDictByCustIndustry;
	}

	public SysUser getSysUserByCustUserId() {
		return this.sysUserByCustUserId;
	}

	public void setSysUserByCustUserId(SysUser sysUserByCustUserId) {
		this.sysUserByCustUserId = sysUserByCustUserId;
	}

	public SysUser getSysUserByCustCreateId() {
		return this.sysUserByCustCreateId;
	}

	public void setSysUserByCustCreateId(SysUser sysUserByCustCreateId) {
		this.sysUserByCustCreateId = sysUserByCustCreateId;
	}

	public String getCustName() {
		return this.custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustLinkman() {
		return this.custLinkman;
	}

	public void setCustLinkman(String custLinkman) {
		this.custLinkman = custLinkman;
	}

	public String getCustPhone() {
		return this.custPhone;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	public String getCustMobile() {
		return this.custMobile;
	}

	public void setCustMobile(String custMobile) {
		this.custMobile = custMobile;
	}

	public Set getSaleVisits() {
		return this.saleVisits;
	}

	public void setSaleVisits(Set saleVisits) {
		this.saleVisits = saleVisits;
	}

	public Set getCstLinkmans() {
		return this.cstLinkmans;
	}

	public void setCstLinkmans(Set cstLinkmans) {
		this.cstLinkmans = cstLinkmans;
	}

	public Date getCustCreatetime() {
		return custCreatetime;
	}

	public void setCustCreatetime(Date custCreatetime) {
		this.custCreatetime = custCreatetime;
	}
}
