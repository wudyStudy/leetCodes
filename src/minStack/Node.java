package minStack;

/**
 * ջ�еĽڵ㶨�壨����ڵ�Ԫ�ص�ͬʱ��Ҫ����ջ����С��Ԫ�ص�ֵ��
 * @author wudy
 *
 */
class Node {
	
    int value;//��ǰԪ�ص�ֵ
    int minValue;//��������ջ����С��Ԫ��(ֻ��Ҫ��վ��Ԫ��������������Ծ�����)
    Node next;//ָ����һ�ڵ㣬ģ��ջ��ʵ��

    /**
     * ���캯����ʵ����ջ�Ľڵ�
     * @param value
     */
    public Node(int value) {
        this.value = value;
    }
}