package com.sxt;

import java.awt.*;

/**
 * ������
 * ��ž�̬����
 * ���߷���
 */
//����滮
public class GameUtil {
    //���׸���
    static int RAY_MAX = 100;
    //��ͼ�Ŀ�
    static int MAP_W = 36;
    //��ͼ�ĸ�
    static int MAP_H = 17;
    //����ƫ����
    static int OFFSET = 45;
    //���ӱ߳�
    static int SQUARE_LENGTH = 34;

    //��������
    static int FLAG_NUM = 0;

    //������
    //����
    static int MOUSE_X;
    static int MOUSE_Y;
    //״̬
    static boolean LEFT = false;
    static boolean RIGHT = false;

    //��Ϸ״̬ 0 ��ʾ��Ϸ�� 1 ʤ�� 2 ʧ�� 3 �Ѷ�ѡ��
    static int state = 3;
    //��Ϸ�Ѷ�
    static int level;

    //����ʱ
    static long START_TIME;
    static long END_TIME;

    //�ײ�Ԫ��  -1 �� 0 �� 1-8 ��ʾ��Ӧ����
    static int[][] DATA_BOTTOM = new int[MAP_W+2][MAP_H+2];
    //����Ԫ��  -1 �޸��� 0 ���� 1 ���� 2 �����
    static int[][] DATA_TOP = new int[MAP_W+2][MAP_H+2];

    //����ͼƬ
    static Image lei = Toolkit.getDefaultToolkit().getImage("imgs/lei.png");
    static Image top = Toolkit.getDefaultToolkit().getImage("imgs/top.gif");
    static Image flag = Toolkit.getDefaultToolkit().getImage("imgs/flag.gif");
    static Image noflag = Toolkit.getDefaultToolkit().getImage("imgs/noflag.png");

    static Image face = Toolkit.getDefaultToolkit().getImage("imgs/face.png");
    static Image over = Toolkit.getDefaultToolkit().getImage("imgs/over.png");
    static Image win = Toolkit.getDefaultToolkit().getImage("imgs/win.png");

    static Image[] images = new Image[9];
    static {
        for (int i = 1; i <=8 ; i++) {
            images[i] = Toolkit.getDefaultToolkit().getImage("imgs/num/"+i+".png");
        }
    }

    static void drawWord(Graphics g,String str,int x,int y,int size,Color color){
        g.setColor(color);
        g.setFont(new Font("����",Font.BOLD,size));
        g.drawString(str,x,y);

    }

}

