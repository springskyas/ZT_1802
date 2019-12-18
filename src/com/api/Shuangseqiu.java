package com.api;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Shuangseqiu {

	public static void main(String[] args) {
		//定义一个数组，存放系统随机生成的6个红色球号码
		int[] sysRedBall = new int[6];
		//定义一个整数，存放系统随机生成的蓝色球号码
		int sysBlueBall = 0;
		//定义一个数组，存放用户生成自己选择的6个红色球号码
		int[] userRedBall = new int[6];
		//定义一个整数，存放用户生成自己选择的蓝色球号码
		int userBlueBall = 0;
		//定义两个整数变量，一个存放正确的红球的个数，另一个存放正确的蓝色个数
		int redCount = 0;
		int blueCount = 0;
		//定义一个数组，存放红球的池子，1-33
		int[] redBalls = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,
				18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33};
		//让系统自动生成中奖号码
		//获取随机数
		Random r = new Random();
		//System.out.println(r.nextInt(33)); //从0-32随机产生一个数
		//从redBalls随机产生6个数，并不重复
		for(int i=0;i<sysRedBall.length;i++) {
			int index = 0;
			while(true) {
				index = r.nextInt(33);  //返回一个0-32之间的一个随机数
				if(redBalls[index]!=-1) {  //根据产生随机数（数组下标）取出对应的值
					sysRedBall[i] = redBalls[index];
					redBalls[index] = -1;
					break;
				}
			}
		}
		sysBlueBall = r.nextInt(16)+1;  //随机产生一个蓝色球
		//让用户选择双色球号码
		Scanner sc = new Scanner(System.in);//开启监听监听键盘动作
		System.out.println("请选择红色球号码，1-33之间选，选6次，不能重复");
		for(int i=0;i<userRedBall.length;i++) {
			userRedBall[i] = sc.nextInt();//捕获键盘输入的数组
		}
		System.out.println("请选择蓝色球号码，1-16之间选，选1次");
		userBlueBall = sc.nextInt();
		//判断是否中奖
		for(int i=0;i<sysRedBall.length;i++) {
			for(int j=0;j<userRedBall.length;j++) {
				if(sysRedBall[i]==userRedBall[j]){
					redCount++;
				}
			}
		}
		if(sysBlueBall==userBlueBall) {
			blueCount++;
		}
		//显示中奖情况
		if(redCount==6 && blueCount==1) {
			System.out.println("恭喜你中了一等奖，奖金1000万");
		}else if(redCount==6 && blueCount==0) {
			System.out.println("恭喜你中了二等奖，奖金500万");
		}else if(redCount==5 && blueCount==1) {
			System.out.println("恭喜你中了三等奖，奖金3000元");
		}else if(redCount==5 && blueCount==0 || redCount==4 && blueCount==1) {
			System.out.println("恭喜你中了四等奖，奖金200元");
		}else if(redCount==4 && blueCount==0 || redCount==3 && blueCount==1) {
			System.out.println("恭喜你中了五等奖，奖金10元");
		}else if(redCount==2 && blueCount==1 || redCount==1 && blueCount==1 || redCount==0) {
			System.out.println("恭喜你中了六等奖，奖金5元");
		}else {
			System.out.println("谢谢参与，下次再来！");
		}
		//将系统开的中奖号码和用户选择的彩票号码输出来
		System.out.println("本期开奖红球号码:" + Arrays.toString(sysRedBall) + "蓝球号码" + sysBlueBall);
		System.out.println("用户选择红球号码:" + Arrays.toString(userRedBall) + "蓝球号码" + userBlueBall);

	}

}
