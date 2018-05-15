package Algorithm.BigMap;

/**
 * Bigmaps�㷨
 * ���⣺
 * ��Ѷ�����⣺��20�ڸ����ظ���unsigned int��������û�Ź���ģ�Ȼ���ٸ�һ������
 * ��ο����ж�������Ƿ�����40�ڸ������в��������ڴ澡���ܵ��٣�
 *
 *  ��νbitmap��������ÿһλ�����ĳ��״̬�������ڴ��ģ���ݣ�������״̬�ֲ��Ǻܶ�������ͨ���������ж�ĳ�����ݴ治���ڵġ�
 *  ���磬Ҫ�ж�һǧ����˵�״̬��ÿ����ֻ������״̬�����ˣ�Ů�ˣ�������0��1��ʾ����ô�Ϳ��Կ�һ��int���飬һ��int��32��λ���Ϳ��Ա�ʾ32���ˡ�������ʱ�����ʹ��λ������
 */

/**
 * ʹ�ó��� �������� ������ȥ��
 * ��ʵ�����ǰ�int��С�����˳�����ΰڷŵ�byte[]�У�
 * ���漰��һЩ����2�������ݺͶ�2��������ȡ���λ����С���ɡ�
 * ����Ȼ������С������������ȡֵ��ϡ�裬����ķ�����û��ʲô���ƣ�
 * �����ں����ġ�ȡֵ�ֲ��ܾ��ȵļ��Ͻ���ȥ�أ�Bitmap�����ѹ��������Ҫ���ڴ�ռ䡣
 *
 * �ŵ㣺�ռ临�ӶȲ���ԭʼ������Ԫ�صĸ������Ӷ�����
 * ȱ�㣺�ռ临�Ӷ��漯�������Ԫ���������������
 *
 */
public class Bitmap {

    public static final int _1MB = 1024 * 1024;

    // 512 MB = 2^29 Byte = 2^32 bit
    //�����ϣ����Դ洢2^32�����ݣ���˼Ϊֻ�洢�����Ƿ���ڵı�ǣ�
    public static byte[] flags = new byte[ 512 * _1MB ];

    public static void main(String[] args) {

        int[] array = {255, 1024, 0, 65536,65536};

        int index = 0;
        for(int num : array) {
            if(!getFlags(num)) {
                //δ���ֵ�Ԫ��
                array[index] = num;
                index = index + 1;
                //���ñ�־λ
                setFlags(num);
            }
        }
    }

    /**
     * |= : a|=b����˼���ǰ�a��b��λ��Ȼ��ֵ��a ��λ�����˼�����Ȱ�a��b������2���ƣ�Ȼ���û�������൱��a=a|b
     */
    //��������
    public static void setFlags(int num) {
        flags[num >> 3] |= 0x01 << (num & (0x07));
    }

    //�ж������Ƿ����
    public static boolean getFlags(int num) {
        return (flags[num >> 3] >> (num & (0x07)) & 0x01 )!=0;
    }
}