package com.meta64.mobile.response;

import com.meta64.mobile.model.NodeInfo;
import com.meta64.mobile.response.base.OakResponseBase;

public class SaveNodeResponse extends OakResponseBase {
	private NodeInfo node;

	public NodeInfo getNode() {
		return node;
	}

	public void setNode(NodeInfo node) {
		this.node = node;
	}
}
