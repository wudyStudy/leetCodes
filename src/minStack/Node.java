package minStack;

/**
 * 栈中的节点定义（保存节点元素的同时需要保存栈中最小的元素的值）
 * @author wudy
 *
 */
class Node {
	
    int value;//当前元素的值
    int minValue;//用来保存栈中最小的元素(只需要在站定元素中设置这个属性就行了)
    Node next;//指向下一节点，模仿栈的实现

    /**
     * 构造函数，实例化栈的节点
     * @param value
     */
    public Node(int value) {
        this.value = value;
    }
}