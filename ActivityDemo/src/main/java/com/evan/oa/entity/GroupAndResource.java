package com.evan.oa.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "T_GROUP_RESOURCE")
public class GroupAndResource implements Serializable {

	private static final long serialVersionUID = 5606409519598928351L;

	@Id
    @GeneratedValue
    private Integer id;

    @Column(name = "group_id")
    private Integer groupId;

    @Column(name = "resource_id")
    private Integer resourceId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public Integer getResourceId() {
		return resourceId;
	}

	public void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
	}
    
}
