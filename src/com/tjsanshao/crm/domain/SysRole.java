package com.tjsanshao.crm.domain;

import java.util.HashSet;
import java.util.Set;

public class SysRole {
	private Long roleId;
	private String roleName;
	private String roleMemo;
	private Set sysUsers = new HashSet(0);
	private Set sysPermissions = new HashSet(0);

	public SysRole() {
	}

	public SysRole(String roleName) {
		this.roleName = roleName;
	}

	public SysRole(String roleName, String roleMemo, Set sysUsers, Set sysPermissions) {
		this.roleName = roleName;
		this.roleMemo = roleMemo;
		this.sysUsers = sysUsers;
		this.sysPermissions = sysPermissions;
	}

	public Long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleMemo() {
		return this.roleMemo;
	}

	public void setRoleMemo(String roleMemo) {
		this.roleMemo = roleMemo;
	}

	public Set getSysUsers() {
		return this.sysUsers;
	}

	public void setSysUsers(Set sysUsers) {
		this.sysUsers = sysUsers;
	}

	public Set getSysPermissions() {
		return this.sysPermissions;
	}

	public void setSysPermissions(Set sysPermissions) {
		this.sysPermissions = sysPermissions;
	}
}
