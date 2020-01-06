package cn.icloudit.permission.entity;

import java.util.List;

public class ComboTreeModel {

    private String id; //节点ID，对加载远程数据很重要。
    private String text; //显示节点文本。
    private String state; //节点状态，'open' 或 'closed'，默认:'open'。如果为'closed'的时候，将不自动展开该节点。
    private String checked; //表示该节点是否被选中。
    private String attributes; // 被添加到节点的自定义属性。
    private List<ComboTreeModel> children; // 一个节点数组声明了若干节点。
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getChecked() {
        return checked;
    }
    public void setChecked(String checked) {
        this.checked = checked;
    }
    public String getAttributes() {
        return attributes;
    }
    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }
    public List<ComboTreeModel> getChildren() {
        return children;
    }
    public void setChildren(List<ComboTreeModel> children) {
        this.children = children;
    }
}
