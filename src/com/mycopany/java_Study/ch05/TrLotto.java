package com.mycopany.java_Study.ch05;

import java.util.Arrays;
import java.util.Random;
public class TrLotto {

	public static void main(String[] args) {
		
		String[] oldNumber = {
				"3,6,14,22,30,41",
				"1,10,18,22,28,31",
				"4,7,19,26,33,35",
				"7,10,19,23,28,33",
				"6,11,16,19,21,32",
				"3,18,19,23,32,45",
				"3,6,9,18,22,35",
				"3,6,22,23,24,38",
				"20,31,32,40,41,45",
				"4,24,27,35,37,45",
				"3,10,24,33,38,45",
				"7,10,22,25,34,40",
				"11,23,25,30,32,40",
				"8,13,19,27,40,45",
				"13,20,24,32,36,45",
				"4,7,12,14,22,33",
				"14,19,27,28,30,45",
				"22,26,29,30,34,45",
				"5,17,26,27,35,38",
				"21,26,30,32,33,35",
				"6,12,31,35,38,43",
				"3,5,13,20,21,37",
				"6,12,17,21,32,39",
				"2,20,33,40,42,44",
				"7,16,25,29,35,36",
				"6,14,15,19,21,41",
				"12,17,20,26,28,36",
				"3,5,12,22,26,31",
				"5,14,15,23,34,43",
				"6,7,9,11,17,18",
				"8,16,26,29,31,36",
				"2,3,6,19,36,39",
				"7,16,24,27,37,44",
				"2,14,15,22,27,33",
				"2,5,22,32,34,45",
				"9,14,34,35,41,42",
				"26,31,32,33,38,40",
				"3,11,15,20,35,44",
				"1,6,12,19,36,42",
				"6,7,22,32,35,36",
				"2,5,11,17,24,29",
				"12,30,32,37,39,41",
				"5,7,12,13,18,35",
				"14,16,27,35,39,45",
				"5,12,13,31,32,41",
				"8,9,20,25,29,33",
				"9,18,20,22,38,44",
				"10,14,16,18,29,35",
				"5,6,11,29,42,45",
				"12,15,17,24,29,45",
				"12,27,29,38,41,45",
				"1,4,13,17,34,39",
				"3,19,21,25,37,45",
				"12,18,22,23,30,34",
				"15,26,28,34,41,42",
				"14,23,31,33,37,40",
				"3,11,14,18,26,27",
				"21,22,26,34,36,41",
				"5,11,18,20,35,45",
				"1,9,12,26,35,38",
				"9,12,15,25,34,36",
				"15,23,29,34,40,44",
				"9,11,30,31,41,44",
				"8,11,16,19,21,25",
				"8,11,15,16,17,37",
				"8,13,18,24,27,29",
				"7,15,30,37,39,44",
				"1,4,29,39,43,45",
				"17,25,33,35,38,45",
				"6,10,12,14,20,42",
				"2,8,19,22,32,42",
				"1,3,9,14,18,28",
				"13,17,18,20,42,45",
				"4,7,14,16,24,44",
				"6,11,15,24,32,39",
				"1,4,13,29,38,39",
				"1,3,8,24,27,35",
				"6,14,16,18,24,42",
				"12,20,26,33,44,45",
				"13,18,25,31,33,44",
				"2,4,25,26,36,37",
				"17,18,21,27,29,33",
				"2,13,20,30,31,41",
				"2,4,15,23,29,38",
				"7,10,16,28,41,42",
				"17,21,23,30,34,44",
				"3,10,23,35,36,37",
				"13,23,26,31,35,43",
				"5,7,13,20,21,44",
				"27,36,37,41,43,45",
				"3,13,16,23,24,35",
				"7,11,16,21,27,33",
				"1,7,15,32,34,42",
				"2,9,10,14,22,44",
				"4,12,14,25,35,37",
				"7,8,9,17,22,24",
				"1,2,11,16,39,44",
				"22,26,31,37,41,42",
				"3,6,17,23,37,39",
				"2,6,17,18,21,26",
				"9,11,16,21,28,36",
				"3,9,10,29,40,45",
				"2,5,12,14,24,39",
				"1,6,13,37,38,40",
				"1,21,25,29,34,37",
				"2,13,25,28,29,36",
				"6,21,36,38,39,43",
				"6,12,19,23,34,42",
				"1,18,28,31,34,43",
				"11,20,29,31,33,42",
				"2,18,24,30,32,45",
				"1,14,15,24,40,41",
				"2,9,10,16,35,37",
				"4,15,24,35,36,40",
				"10,11,20,21,25,41",
				"4,9,23,26,29,33",
				"1,9,26,28,30,41",
				"7,9,22,27,37,42",
				"4,12,22,24,33,41",
				"2,12,30,31,39,43",
				"3,4,15,22,28,40",
				"14,21,35,36,40,44",
				"13,18,30,31,38,41",
				"3,8,17,20,27,35",
				"9,18,19,30,34,40",
				"9,10,15,30,33,37",
				"2,13,16,19,32,33",
				"1,8,13,36,44,45",
				"10,12,18,35,42,43",
				"12,14,25,27,39,40",
				"3,15,20,22,24,41",
				"4,11,28,39,42,45",
				"4,8,10,16,31,36",
				"2,10,13,22,29,40",
				"7,11,13,17,18,29",
				"4,10,20,32,38,44",
				"1,3,30,33,36,39",
				"23,27,29,31,36,45",
				"1,6,15,36,37,38",
				"14,15,23,25,35,43",
				"8,21,25,38,39,44",
				"7,9,12,15,19,23",
				"3,4,10,20,28,44",
				"4,15,22,38,41,43",
				"10,16,18,20,25,31",
				"13,24,32,34,39,42",
				"3,11,34,42,43,44",
				"3,17,18,23,36,41",
				"2,6,13,17,27,43",
				"5,7,12,22,28,41",
				"2,3,26,33,34,43",
				"9,14,17,18,42,44",
				"7,11,12,31,33,38",
				"1,3,23,24,27,43",
				"6,21,22,32,35,36",
				"2,6,11,13,22,37",
				"16,19,24,33,42,44",
				"6,14,16,21,27,37",
				"5,8,18,21,22,38",
				"4,5,12,14,32,42",
				"1,11,17,27,35,39",
				"7,24,29,30,34,35",
				"3,16,21,22,23,44",
				"21,27,29,38,40,44",
				"2,5,14,28,31,32",
				"3,4,16,27,38,40",
				"2,6,8,26,43,45",
				"2,15,16,21,22,28",
				"7,19,23,24,36,39",
				"5,18,20,23,30,34",
				"7,13,16,18,35,38",
				"8,19,20,21,33,39",
				"18,21,28,35,37,42",
				"6,7,12,22,26,36",
				"5,12,25,26,38,45",
				"16,26,31,38,39,41",
				"19,32,37,40,41,43",
				"1,15,17,23,25,41",
				"4,9,17,18,26,42",
				"9,13,28,31,39,41",
				"1,4,14,18,29,37",
				"3,13,29,38,39,42",
				"3,7,12,31,34,38",
				"8,14,17,27,36,45",
				"19,23,28,37,42,45",
				"1,3,24,27,39,45",
				"4,14,23,28,37,45",
				"9,18,32,33,37,44",
				"18,34,39,43,44,45",
				"4,18,20,26,27,32",
				"7,17,19,23,24,45",
				"1,4,10,14,15,35",
				"2,6,11,16,25,31",
				"5,17,18,22,23,43",
				"5,16,21,26,34,42",
				"19,22,30,34,39,44",
				"1,15,19,23,28,42",
				"3,5,12,13,33,39",
				"2,4,30,32,33,43",
				"2,6,12,26,30,34",
				"21,25,30,32,40,42",
				"2,6,20,27,37,39",
				"12,17,28,41,43,44",
				"14,17,19,22,24,40",
				"9,15,29,34,37,39",
				"3,15,22,32,33,45",
				"3,7,10,13,25,36",
				"16,21,28,35,39,43",
				"10,34,38,40,42,43",
				"11,17,19,21,22,25",
				"4,8,18,25,27,32",
				"8,22,35,38,39,41",
				"9,13,32,38,39,43",
				"6,10,16,28,34,38",
				"10,24,40,41,43,44",
				"8,15,17,19,43,44",
				"20,25,31,32,36,43",
				"2,8,23,26,27,44",
				"11,17,28,30,33,35",
				"14,18,22,26,31,44",
				"16,20,24,28,36,39",
				"5,13,17,29,34,39",
				"1,2,16,22,38,39",
				"12,16,26,28,30,42",
				"5,18,30,41,43,45",
				"1,16,29,33,40,45",
				"7,8,13,15,33,45",
				"19,21,30,33,34,42",
				"14,26,32,36,39,42",
				"5,11,14,30,33,38",
				"2,4,11,28,29,43",
				"3,9,11,12,13,19",
				"9,14,17,33,36,38",
				"2,25,28,30,33,45",
				"1,9,11,14,26,28",
				"9,10,13,28,38,45",
				"6,8,18,35,42,43",
				"12,18,30,39,41,42",
				"13,14,19,26,40,43",
				"3,10,16,19,31,39",
				"5,6,16,18,37,38",
				"4,5,31,35,43,45",
				"4,7,13,29,31,39",
				"5,11,12,29,33,44",
				"13,16,24,25,33,36",
				"8,15,21,31,33,38",
				"7,9,24,29,34,38",
				"12,18,24,26,39,40",
				"9,18,20,24,27,36",
				"1,12,13,24,29,44",
				"10,21,22,30,35,42",
				"16,25,33,38,40,45",
				"14,15,25,28,29,30",
				"3,9,12,13,25,43",
				"12,18,19,29,31,39",
				"17,21,25,26,27,36",
				"2,21,28,38,42,45",
				"11,30,34,35,42,44",
				"1,3,12,14,16,43",
				"8,11,19,21,36,45",
				"5,10,13,21,39,43",
				"6,11,15,17,23,40",
				"15,21,31,32,41,43",
				"6,10,18,25,34,35",
				"14,20,23,31,37,38",
				"3,12,13,18,31,32",
				"1,10,13,26,32,36",
				"5,9,14,26,30,43",
				"10,11,12,18,24,42",
				"17,25,28,37,43,44",
				"1,4,10,12,28,45",
				"12,17,23,34,42,45",
				"2,10,14,22,32,36",
				"5,22,31,32,39,45",
				"1,21,26,36,40,41",
				"3,10,13,26,34,38",
				"6,7,18,19,30,38",
				"10,15,21,35,38,43",
				"2,7,19,25,29,36",
				"2,10,12,31,33,42",
				"3,8,19,27,30,41",
				"2,6,7,12,19,45",
				"2,10,11,19,35,39",
				"5,6,13,16,27,28",
				"12,15,16,20,24,30",
				"4,6,15,25,26,33",
				"3,10,23,24,31,39",
				"14,15,16,17,38,45",
				"6,18,31,34,38,45",
				"11,16,18,19,24,39",
				"15,17,19,21,27,45",
				"6,12,19,24,34,41",
				"6,21,35,36,37,41",
				"6,12,17,21,34,37",
				"8,9,18,21,28,40",
				"11,12,29,33,38,42",
				"12,15,18,28,34,42",
				"8,12,19,21,31,35",
				"5,6,11,14,21,41",
				"6,10,17,18,21,29",
				"1,9,12,23,39,43",
				"5,7,11,16,41,45",
				"7,27,29,30,38,44",
				"5,15,20,31,34,42",
				"9,30,34,35,39,41",
				"1,3,8,12,42,43",
				"7,22,24,31,34,36",
				"3,8,16,32,34,43",
				"1,3,12,21,26,41",
				"4,7,11,24,42,45",
				"10,22,27,31,42,43",
				"9,33,36,40,42,43",
				"5,9,12,30,39,43",
				"6,7,11,17,33,44",
				"10,14,16,18,27,28",
				"13,14,26,28,30,36",
				"2,8,17,24,29,31",
				"2,17,19,24,37,41",
				"4,16,20,33,40,43",
				"3,4,16,20,28,44",
				"1,2,15,19,24,36",
				"12,14,24,26,34,45",
				"3,10,13,22,31,32",
				"7,9,12,14,23,28",
				"3,12,33,36,42,45",
				"1,2,3,9,12,23",
				"10,15,18,21,34,41",
				"15,19,21,34,41,44",
				"8,10,13,36,37,40",
				"5,21,27,34,44,45",
				"4,8,9,16,17,19",
				"7,22,29,33,34,35",
				"23,27,28,38,42,43",
				"13,15,18,24,27,41",
				"2,11,17,18,21,27",
				"5,10,13,27,37,41",
				"6,16,37,38,41,45",
				"11,24,32,33,35,40",
				"2,4,5,17,27,32",
				"2,7,13,25,42,45",
				"4,10,14,15,18,22",
				"11,17,21,26,36,45",
				"3,6,10,30,34,37",
				"7,8,10,19,21,31",
				"1,11,21,23,34,44",
				"6,7,19,21,41,43",
				"2,8,33,35,37,41",
				"20,30,33,35,36,44",
				"12,14,21,30,39,43",
				"1,28,35,41,43,44",
				"1,12,29,34,36,37",
				"4,8,13,19,20,43",
				"4,11,20,23,32,39",
				"2,11,19,25,28,32",
				"2,6,13,16,29,30",
				"2,7,27,33,41,44",
				"1,7,22,33,37,40",
				"2,5,15,18,19,23",
				"17,20,30,31,33,45",
				"11,15,24,35,37,45",
				"3,4,9,24,25,33",
				"10,18,30,36,39,44",
				"2,10,16,19,34,45",
				"2,12,19,24,39,44",
				"3,4,6,10,28,30",
				"1,6,17,22,28,45",
				"1,4,8,23,33,42",
				"10,28,31,33,41,44",
				"3,13,16,24,26,29",
				"3,10,14,16,36,38",
				"11,23,28,29,30,44",
				"4,5,8,16,21,29",
				"3,11,13,21,33,37",
				"2,5,8,11,33,39",
				"1,7,16,18,34,38",
				"4,18,26,33,34,38",
				"7,15,20,25,33,43",
				"1,6,11,28,34,42",
				"3,11,14,15,32,36",
				"15,27,33,35,43,45",
				"24,25,33,34,38,39",
				"7,17,19,30,36,38",
				"5,15,22,23,34,35",
				"1,8,10,13,28,42",
				"7,12,15,24,25,43",
				"6,7,12,28,38,40",
				"1,11,15,17,25,39",
				"6,13,20,27,28,40",
				"17,23,27,35,38,43",
				"21,24,27,29,43,44",
				"4,10,19,29,32,42",
				"3,5,7,14,26,34",
				"4,5,6,12,25,37",
				"12,15,24,36,41,44",
				"1,8,17,34,39,45",
				"1,8,11,15,18,45",
				"9,10,14,25,27,31",
				"7,10,17,29,33,44",
				"8,21,28,31,36,45",
				"7,9,10,13,31,35",
				"11,18,26,27,40,41",
				"7,8,20,29,33,38",
				"12,14,15,24,27,32",
				"15,17,25,37,42,43",
				"2,4,6,11,17,28",
				"5,6,11,17,38,44",
				"10,20,33,36,41,44",
				"3,5,8,19,38,42",
				"5,6,9,11,15,37",
				"2,3,12,20,27,38",
				"4,9,23,33,39,44",
				"7,18,19,27,29,42",
				"8,19,25,28,32,36",
				"10,14,19,39,40,43",
				"3,7,14,16,31,40",
				"7,37,38,39,40,44",
				"16,21,26,31,36,43",
				"5,6,26,27,38,39",
				"3,13,15,40,41,44",
				"11,12,16,26,29,44",
				"3,4,7,11,31,41",
				"3,21,22,33,41,42",
				"13,19,28,37,38,43",
				"5,16,21,23,24,30",
				"2,9,24,41,43,45",
				"1,4,16,26,40,41",
				"5,13,17,23,28,36",
				"15,24,31,32,33,40",
				"8,17,18,24,39,45",
				"11,18,21,36,37,43",
				"14,15,18,21,26,35",
				"6,15,22,23,25,32",
				"7,18,22,24,31,34",
				"3,16,22,37,38,44",
				"6,7,15,16,20,31",
				"11,13,25,26,29,33",
				"4,10,11,12,20,27",
				"9,12,19,20,39,41",
				"15,18,21,32,35,44",
				"1,2,4,23,31,34",
				"8,17,21,24,27,31",
				"19,28,31,38,43,44",
				"1,7,12,15,23,42",
				"2,9,22,25,31,45",
				"13,14,26,33,40,43",
				"3,6,7,20,21,39",
				"1,7,19,26,27,35",
				"7,13,30,39,41,45",
				"9,15,16,21,28,34",
				"1,2,6,16,19,42",
				"2,16,17,32,39,45",
				"6,8,13,30,35,40",
				"8,16,25,30,42,43",
				"4,5,11,12,24,27",
				"5,13,18,23,40,45",
				"10,17,18,19,23,27",
				"8,21,25,39,40,44",
				"7,8,11,16,41,44",
				"6,9,18,19,25,33",
				"2,22,27,33,36,37",
				"14,18,20,23,28,36",
				"4,8,27,34,39,40",
				"4,8,18,19,39,44",
				"8,14,23,36,38,39",
				"1,5,6,14,20,39",
				"1,2,7,9,10,38",
				"2,6,18,21,33,34",
				"2,19,25,26,27,43",
				"13,14,22,27,30,38",
				"2,16,19,31,34,35",
				"5,11,14,27,29,36",
				"5,12,17,29,34,35",
				"4,12,24,33,38,45",
				"8,10,23,24,35,43",
				"3,4,12,14,25,43",
				"8,24,28,35,38,40",
				"2,8,13,25,28,37",
				"9,10,13,24,33,38",
				"2,5,6,13,28,44",
				"8,13,14,30,38,39",
				"20,30,36,38,41,45",
				"6,8,28,33,38,39",
				"2,8,15,22,25,41",
				"14,21,29,31,32,37",
				"2,7,12,15,21,34",
				"6,7,10,16,38,41",
				"7,18,30,39,40,41",
				"8,17,27,33,40,44",
				"2,12,14,33,40,41",
				"3,5,14,20,42,44",
				"5,7,9,11,32,35",
				"5,7,20,22,37,42",
				"5,12,14,32,34,42",
				"16,17,22,31,34,37",
				"10,11,15,25,35,41",
				"2,8,20,30,33,34",
				"14,15,16,19,25,43",
				"2,4,20,34,35,43",
				"3,13,18,33,37,45",
				"11,18,21,26,38,43",
				"1,12,26,27,29,33",
				"3,6,13,23,24,35",
				"1,3,17,20,31,44",
				"1,10,15,16,32,41",
				"4,5,6,25,26,43",
				"4,10,18,27,40,45",
				"14,19,25,26,27,34",
				"5,10,16,17,31,32",
				"4,11,13,17,20,31",
				"5,7,18,37,42,45",
				"1,4,20,23,29,45",
				"11,12,25,32,44,45",
				"12,15,19,26,40,43",
				"4,20,26,28,35,40",
				"12,20,23,28,30,44",
				"11,17,21,24,26,36",
				"13,14,17,32,41,42",
				"2,7,17,28,29,39",
				"1,10,20,32,35,40",
				"3,6,20,24,27,44",
				"1,7,14,20,34,37",
				"29,31,35,38,40,44",
				"1,12,13,21,32,45",
				"6,7,15,22,34,39",
				"8,17,20,27,37,43",
				"4,24,25,27,34,35",
				"5,17,21,25,36,44",
				"13,18,26,31,34,44",
				"5,6,19,26,41,45",
				"8,13,26,28,32,34",
				"3,12,13,15,34,36",
				"3,19,22,31,42,43",
				"6,10,18,31,32,34",
				"12,23,26,30,36,43",
				"7,8,18,32,37,43",
				"11,12,14,15,18,39",
				"10,24,26,29,37,38",
				"9,14,15,17,31,33",
				"16,17,23,24,29,44",
				"1,5,9,21,27,35",
				"16,23,27,29,33,41",
				"18,20,24,27,31,42",
				"5,17,25,31,39,40",
				"1,12,22,32,33,42",
				"7,14,17,20,35,39",
				"11,23,26,29,39,44",
				"10,11,29,38,41,45",
				"1,4,37,38,40,45",
				"4,5,13,14,37,41",
				"3,7,18,29,32,36",
				"4,22,27,28,38,40",
				"6,8,13,16,30,43",
				"14,23,30,32,34,38",
				"1,9,12,28,36,41",
				"2,8,23,41,43,44",
				"2,11,12,15,23,37",
				"1,15,20,26,35,42",
				"5,8,21,23,27,33",
				"4,5,9,13,26,27",
				"3,7,14,23,26,42",
				"12,29,32,33,39,40",
				"12,25,29,35,42,43",
				"5,27,31,34,35,43",
				"12,13,32,33,40,41",
				"6,9,11,22,24,30",
				"7,20,22,25,38,40",
				"6,14,22,26,43,44",
				"1,5,27,30,34,36",
				"6,22,28,32,34,40",
				"1,4,10,17,31,42",
				"3,4,12,20,24,34",
				"5,20,23,27,35,40",
				"13,14,24,32,39,41",
				"19,20,23,24,43,44",
				"4,13,20,29,36,41",
				"4,13,22,27,34,44",
				"5,7,8,15,30,43",
				"20,22,26,33,36,37",
				"22,27,31,35,37,40",
				"8,17,35,36,39,42",
				"2,7,26,29,40,43",
				"2,4,8,15,20,27",
				"2,8,17,30,31,38",
				"4,8,25,27,37,41",
				"1,2,23,25,38,40",
				"17,22,26,27,36,39",
				"1,3,27,28,32,45",
				"12,15,19,22,28,34",
				"1,10,16,24,25,35",
				"3,4,23,29,40,41",
				"3,5,10,17,30,31",
				"8,23,25,27,35,44",
				"18,29,30,37,39,43",
				"14,25,29,32,33,45",
				"9,12,13,15,37,38",
				"1,9,14,16,21,29",
				"4,13,18,31,33,45",
				"8,13,20,22,23,36",
				"16,25,26,31,36,43",
				"6,13,29,37,39,41",
				"10,16,20,39,41,42",
				"4,21,22,34,37,38",
				"8,13,15,28,37,43",
				"2,12,14,17,24,40",
				"4,10,13,23,32,44",
				"1,8,11,13,22,38",
				"6,12,15,34,42,44",
				"23,29,31,33,34,44",
				"3,20,24,32,37,45",
				"11,18,26,31,37,40",
				"8,11,28,30,43,45",
				"4,6,10,14,25,40",
				"4,9,10,32,36,40",
				"8,10,18,23,27,40",
				"1,7,12,18,23,27",
				"4,19,20,26,30,35",
				"13,25,27,34,38,41",
				"12,24,33,38,40,42",
				"8,10,18,30,32,34",
				"12,15,20,24,30,38",
				"6,14,19,21,23,31",
				"3,10,20,26,35,43",
				"3,7,13,27,40,41",
				"2,7,8,9,17,33",
				"1,11,12,14,26,35",
				"13,20,21,30,39,45",
				"11,13,23,35,43,45",
				"4,6,10,19,20,44",
				"25,27,29,36,38,40",
				"1,23,28,30,34,35",
				"10,22,28,34,36,44",
				"17,20,30,31,37,40",
				"6,12,20,26,29,38",
				"11,16,29,38,41,44",
				"9,14,20,22,33,34",
				"8,16,26,30,38,45",
				"3,13,20,24,33,37",
				"19,23,29,33,35,43",
				"2,3,5,11,27,39",
				"18,22,25,31,38,45",
				"1,3,16,18,30,34",
				"3,23,28,34,39,42",
				"12,16,19,22,37,40",
				"6,7,15,24,28,30",
				"4,17,18,27,39,43",
				"8,10,14,27,33,38",
				"10,11,26,31,34,44",
				"1,17,27,28,29,40",
				"8,15,19,21,34,44",
				"6,11,26,27,28,44",
				"4,9,10,29,31,34",
				"2,11,13,14,28,30",
				"11,13,15,26,28,34",
				"4,5,14,20,22,43",
				"5,6,8,11,22,26",
				"7,17,20,26,30,40",
				"2,14,15,22,23,44",
				"2,9,15,23,34,40",
				"4,7,39,41,42,45",
				"11,14,22,35,37,39",
				"1,3,18,32,40,41",
				"6,9,21,31,32,40",
				"9,20,21,22,30,37",
				"6,7,13,16,24,25",
				"7,12,21,24,27,36",
				"1,2,10,25,26,44",
				"5,20,21,24,33,40",
				"10,14,22,24,28,37",
				"5,9,15,19,22,36",
				"6,12,18,31,38,43",
				"9,21,27,34,41,43",
				"1,2,9,17,19,42",
				"10,15,20,23,42,44",
				"12,13,17,22,25,33",
				"18,20,31,34,40,45",
				"11,15,20,26,31,35",
				"1,13,20,22,25,28",
				"9,16,28,40,41,43",
				"1,3,7,8,24,42",
				"10,11,18,22,28,39",
				"16,17,28,37,39,40",
				"7,16,18,20,23,26",
				"1,8,9,17,29,32",
				"1,26,31,34,40,43",
				"4,7,10,19,31,40",
				"7,12,19,21,29,32",
				"11,22,24,32,36,38",
				"4,15,28,33,37,40",
				"10,15,22,24,27,42",
				"1,5,10,12,16,20",
				"1,2,8,17,26,37",
				"6,10,22,31,35,40",
				"5,22,29,31,34,39",
				"6,22,29,37,43,45",
				"1,11,13,24,28,40",
				"4,8,19,25,27,45",
				"11,13,15,17,25,34",
				"15,26,37,42,43,45",
				"8,11,14,16,18,21",
				"7,9,15,26,27,42",
				"16,18,24,42,44,45",
				"17,20,35,36,41,43",
				"11,21,24,30,39,45",
				"3,22,25,29,32,44",
				"5,12,19,26,27,44",
				"5,15,21,25,26,30",
				"2,5,7,14,16,40",
				"11,12,14,21,32,38",
				"2,3,22,27,30,40",
				"5,10,16,24,27,35",
				"4,16,23,25,35,40",
				"1,10,19,20,24,40",
				"1,9,10,12,21,40",
				"10,14,18,21,36,37",
				"2,8,14,25,29,45",
				"5,8,29,30,35,44",
				"14,19,36,43,44,45",
				"11,16,19,22,29,36",
				"5,16,17,20,26,41",
				"5,25,27,29,34,36",
				"1,8,18,24,29,33",
				"5,13,14,20,24,25",
				"3,14,17,20,24,31",
				"3,8,13,27,32,42",
				"5,13,14,22,44,45",
				"15,20,23,29,39,42",
				"1,2,15,28,34,45",
				"1,10,17,29,31,43",
				"1,13,14,33,34,43",
				"1,8,19,34,39,43",
				"18,24,26,29,34,38",
				"6,8,14,21,30,37",
				"2,13,34,38,42,45",
				"1,5,14,18,32,37",
				"3,5,20,34,35,44",
				"5,9,16,23,26,45",
				"13,15,21,29,39,43",
				"5,14,27,30,39,43",
				"16,17,34,36,42,45",
				"4,9,14,26,31,44",
				"3,4,16,17,19,20",
				"9,17,19,30,35,42",
				"1,6,9,16,17,28",
				"6,12,13,17,32,44",
				"16,23,25,33,36,39",
				"7,17,20,32,44,45",
				"2,4,21,25,33,36",
				"10,14,15,32,36,42",
				"9,18,29,32,38,43",
				"12,18,20,21,25,34",
				"16,19,23,25,41,45",
				"5,8,22,28,33,42",
				"2,17,19,20,34,45",
				"3,10,11,22,36,39",
				"10,11,21,27,31,39",
				"1,13,33,35,43,45",
				"15,17,19,34,38,41",
				"9,17,34,35,43,45",
				"2,3,5,6,12,20",
				"4,12,24,27,28,32",
				"1,5,19,28,34,41",
				"1,2,5,11,18,36",
				"14,15,17,19,37,45",
				"5,15,21,23,25,45",
				"4,18,23,30,34,41",
				"7,8,18,21,23,39",
				"4,10,16,26,33,41",
				"2,14,17,30,38,45",
				"13,19,20,32,38,42",
				"7,11,13,33,37,43",
				"7,9,10,12,26,38",
				"1,3,20,25,36,45",
				"5,9,27,29,37,40",
				"6,11,19,20,28,32",
				"3,8,15,27,30,45",
				"1,4,12,16,18,38",
				"6,10,17,30,37,38",
				"1,9,17,21,29,33",
				"17,18,31,32,33,34",
				"3,7,8,18,20,42",
				"8,13,18,32,39,45",
				"3,14,33,37,38,42",
				"1,12,17,28,35,41",
				"6,12,24,27,35,37",
				"1,15,19,40,42,44",
				"13,33,37,40,41,45",
				"2,7,15,24,30,45",
				"6,8,18,31,38,45",
				"2,5,10,18,31,32",
				"1,3,4,6,14,41",
				"10,11,23,24,36,37",
				"7,16,31,36,37,38",
				"3,11,37,39,41,43",
				"10,12,13,15,25,29",
				"4,15,21,33,39,41",
				"14,19,20,35,38,40",
				"13,14,15,26,35,39",
				"1,8,24,31,34,44",
				"7,9,12,27,39,43",
				"3,8,9,27,29,40",
				"5,9,12,20,21,26",
				"5,18,20,36,42,43",
				"3,10,19,24,32,45",
				"7,8,24,34,36,41",
				"3,4,9,11,22,42",
				"5,9,34,37,38,39",
				"9,16,27,36,41,44",
				"1,27,28,32,37,40",
				"9,12,24,25,29,31",
				"6,11,16,18,31,43",
				"7,12,15,24,37,40",
				"4,5,14,35,42,45",
				"14,27,30,31,38,40",
				"6,13,27,31,32,37",
				"4,11,14,21,23,43",
				"1,5,6,24,27,42",
				"1,5,19,20,24,30",
				"8,19,25,31,34,36",
				"14,23,26,31,39,45",
				"6,7,19,25,28,38",
				"19,23,30,37,43,45",
				"3,8,27,31,41,44",
				"3,8,17,23,38,45",
				"12,15,28,36,39,40",
				"13,18,21,23,26,39",
				"9,11,27,31,32,38",
				"13,16,25,36,37,38",
				"2,12,17,19,28,42",
				"4,19,20,21,32,34",
				"2,16,24,27,28,35",
				"6,10,16,40,41,43",
				"11,15,24,39,41,44",
				"2,4,15,28,31,34",
				"1,11,17,21,24,44",
				"1,4,8,13,37,39",
				"21,22,26,27,31,37",
				"13,21,22,24,26,37",
				"4,6,13,17,28,40",
				"8,9,10,12,24,44",
				"5,10,19,31,44,45",
				"5,11,14,29,32,33",
				"4,5,9,11,23,38",
				"17,25,35,36,39,44",
				"4,5,15,16,22,42",
				"2,6,8,14,21,22",
				"5,11,13,19,31,36",
				"4,19,26,27,30,42",
				"1,3,18,20,26,27",
				"5,7,28,29,39,43",
				"2,20,33,35,37,40",
				"5,11,19,21,34,43",
				"4,11,20,26,35,37",
				"1,8,14,18,29,44",
				"16,20,27,33,35,39",
				"7,16,17,33,36,40",
				"2,3,7,15,43,44",
				"5,7,20,25,28,37",
				"2,3,4,5,20,24",
				"11,12,18,21,31,38",
				"12,13,17,20,33,41",
				"10,19,22,23,25,37",
				"2,7,18,20,24,33",
				"14,25,31,34,40,44",
				"3,11,14,31,32,37",
				"1,2,3,15,20,25",
				"1,3,21,29,35,37",
				"3,12,14,35,40,45",
				"1,3,11,24,30,32",
				"12,14,27,33,39,44",
				"3,11,24,38,39,44",
				"5,6,13,14,17,20",
				"14,21,22,25,30,36",
				"12,19,20,25,41,45",
				"7,12,16,34,42,45",
				"35,36,37,41,44,45",
				"7,10,19,22,35,40",
				"15,20,23,26,39,44",
				"6,14,18,26,36,39",
				"4,8,11,18,37,45",
				"5,6,24,25,32,37",
				"8,14,18,30,31,44",
				"8,14,32,35,37,45",
				"19,24,27,30,31,34",
				"1,2,8,18,29,38",
				"4,10,14,19,21,45",
				"1,2,4,8,19,38",
				"1,2,6,16,20,33",
				"2,18,24,34,40,42",
				"13,15,27,29,34,40",
				"14,21,23,32,40,45",
				"2,15,20,21,29,34",
				"5,9,17,25,39,43",
				"1,5,11,12,18,23",
				"1,10,13,16,37,43",
				"4,17,30,32,33,34",
				"19,26,28,31,33,36",
				"13,14,18,22,35,39",
				"3,9,24,30,33,34",
				"4,19,21,24,26,41",
				"4,16,25,29,34,35",
				"2,11,13,15,31,42",
				"16,27,35,37,43,45",
				"3,10,31,40,42,43",
				"24,27,28,30,36,39",
				"9,12,27,36,39,45",
				"5,13,18,19,22,42",
				"6,9,10,11,39,41",
				"7,11,26,28,29,44",
				"1,5,21,25,38,41",
				"22,34,36,40,42,45",
				"3,7,8,34,39,41",
				"1,18,30,41,42,43",
				"4,9,13,18,21,34",
				"19,26,30,33,35,39",
				"5,18,28,30,42,45",
				"16,19,20,32,33,41",
				"6,19,21,35,40,45",
				"3,8,11,12,13,36",
				"1,5,13,26,29,34",
				"1,2,10,13,18,19",
				"2,18,25,28,37,39",
				"2,11,21,34,41,42",
				"21,25,33,34,35,36",
				"4,6,13,21,40,42",
				"2,19,27,35,41,42",
				"2,3,13,20,27,44",
				"4,15,17,26,36,37",
				"26,27,28,42,43,45",
				"12,16,30,34,40,44",
				"8,12,29,31,42,43",
				"3,13,17,18,19,28",
				"9,11,15,20,28,43",
				"10,11,27,28,37,39",
				"7,9,20,25,36,39",
				"2,16,30,36,41,42",
				"6,14,22,28,35,39",
				"3,12,20,23,31,35",
				"4,7,15,18,23,26",
				"3,17,23,34,41,45",
				"8,10,11,14,15,21",
				"7,19,24,27,42,45",
				"19,23,25,28,38,42",
				"12,30,34,36,37,45",
				"3,5,10,29,32,43",
				"7,20,22,27,40,43",
				"2,8,32,33,35,36",
				"4,16,23,25,29,42",
				"7,17,18,28,30,45",
				"1,11,16,17,36,40",
				"12,28,30,34,38,43",
				"4,6,10,11,32,37",
				"3,11,13,14,17,21",
				"3,4,10,17,19,22",
				"5,10,22,34,36,44",
				"2,4,25,31,34,37",
				"1,2,6,9,25,28",
				"11,14,19,26,28,41",
				"4,9,28,33,36,45",
				"26,29,30,33,41,42",
				"7,18,31,33,36,40",
				"7,20,22,23,29,43",
				"1,5,34,36,42,44",
				"7,18,22,23,29,44",
				"1,4,5,6,9,31",
				"4,10,12,22,24,33",
				"8,10,20,34,41,45",
				"17,32,33,34,42,44",
				"5,14,15,27,30,45",
				"17,22,24,26,35,40",
				"1,3,17,32,35,45",
				"1,7,11,23,37,42",
				"1,3,10,27,29,37",
				"6,9,16,23,24,32",
				"6,7,14,15,20,36",
				"1,3,8,21,22,31",
				"8,17,27,31,34,43",
				"5,32,34,40,41,45",
				"6,22,24,36,38,44",
				"3,14,24,33,35,36",
				"1,21,24,26,29,42",
				"17,20,29,35,38,44",
				"4,26,28,29,33,40",
				"1,17,20,24,30,41",
				"4,12,16,23,34,43",
				"2,12,37,39,41,45",
				"6,8,13,23,31,36",
				"16,23,27,34,42,45",
				"6,10,15,17,19,34",
				"1,2,3,14,27,42",
				"5,7,11,13,20,33",
				"17,18,24,25,26,30",
				"3,12,24,27,30,32",
				"10,13,25,29,33,35",
				"2,18,29,32,43,44",
				"1,3,15,22,25,37",
				"2,5,24,32,34,44",
				"6,15,17,18,35,40",
				"3,12,18,32,40,43",
				"2,4,11,17,26,27",
				"5,9,12,16,29,41",
				"5,19,22,25,28,43",
				"5,8,14,15,19,39",
				"10,12,15,16,26,39",
				"3,7,10,15,36,38",
				"2,3,7,17,22,24",
				"4,25,33,36,40,43",
				"14,15,18,21,26,36",
				"3,20,23,36,38,40",
				"3,8,15,27,29,35",
				"14,15,19,30,38,43",
				"2,8,25,36,39,42",
				"6,29,36,39,41,45",
				"10,24,25,33,40,44",
				"7,10,16,25,29,44",
				"10,14,30,31,33,37",
				"17,21,31,37,40,44",
				"1,8,21,27,36,39",
				"7,8,14,32,33,39",
				"2,4,15,16,20,29",
				"2,3,11,16,26,44",
				"2,10,12,15,22,44",
				"4,7,16,19,33,40",
				"6,10,18,26,37,38",
				"14,17,26,31,36,45",
				"8,13,15,23,31,38",
				"1,10,20,27,33,35",
				"3,11,21,30,38,45",
				"6,31,35,38,39,44",
				"17,18,19,21,23,32",
				"13,20,23,35,38,43",
				"7,13,18,19,25,26",
				"6,7,13,15,21,43",
				"16,17,22,30,37,43",
				"7,27,30,33,35,37",
				"1,10,23,26,28,40",
				"2,3,11,26,37,43",
				"9,26,35,37,40,42",
				"4,7,32,33,40,41",
				"6,14,19,25,34,44",
				"7,9,18,23,28,35",
				"8,17,20,35,36,44",
				"1,5,13,34,39,40",
				"9,18,23,25,35,37",
				"1,20,26,28,37,43",
				"4,5,7,18,20,25",
				"2,4,21,26,43,44",
				"7,8,27,29,36,43",
				"5,13,17,18,33,42",
				"4,5,6,8,17,39",
				"6,12,17,18,31,32",
				"10,14,18,20,23,30",
				"6,30,38,39,40,43",
				"3,12,13,19,32,35",
				"3,4,9,17,32,37",
				"6,7,24,37,38,40",
				"3,4,16,30,31,37",
				"2,6,12,31,33,40",
				"22,23,25,37,38,42",
				"2,11,21,25,39,45",
				"1,7,36,37,41,42",
				"9,25,30,33,41,44",
				"2,4,16,17,36,39",
				"8,19,25,34,37,39",
				"2,9,16,25,26,40",
				"14,15,26,27,40,42",
				"16,24,29,40,41,42",
				"14,27,30,31,40,42",
				"11,16,19,21,27,31",
				"9,13,21,25,32,42",
				"10,23,29,33,37,40",
			};
		// 선생님 코드
		/*
		double min = 1.0;
		double max = 45.0;
		int random = 0;
		
		String randomString = "";
		int[] randomArray = new int[6];
		
		Boolean isSameNumber = true;
		Boolean isLinearNumber = true;
		Boolean isSameOldNumber = true;
		
		while(isSameNumber || isLinearNumber || isSameOldNumber) {
			// 6개의 숫자 선택
			for (int i=0; i<6; i++) {
				random = (int) ((Math.random() * (max - min)) + min);
				randomArray[i] = random;
			}
			
	//		System.out.println(randomString);
	//		System.out.println("---------");
			
	//		test data
//			randomArray[0] = 1;
//			randomArray[1] = 2;
//			randomArray[2] = 2;
//			randomArray[3] = 6;
//			randomArray[4] = 8;
//			randomArray[5] = 11;
			
			
			// 오름차순 정렬
			 Arrays.sort(randomArray); 
			 
			
//			for(int i=0; i<6; i++) {
//				System.out.println(randomArray[i]);
//			}
			 
			 
//			 중복값 확인
			 aa:
			 for(int i=0; i<6; i++) {
				 for(int j=0; j<6; j++) {
					 if(i != j) {
						 if(randomArray[i] == randomArray[j]) {
							 isSameNumber = true;
							 System.out.println("중복된 숫자가 사용됬다");
							 break aa;
						 } else {
							 isSameNumber = false;
						 }
					 } else {
						 // by pass
					 }
				 }
			 }
			 
			 
			// 3연숙 걸르기
			for(int i=0; i<4; i++) {
	//		1,2,3
	//		2,3,4
	//		3,4,5
	//		4,5,6
	//		4번만 검사하면 됨
				if(randomArray[i]+ 1 == randomArray[i+1] && randomArray[i] + 2 == randomArray[i+2]) {
					System.out.println("걸렸다.: " + randomArray[i] + " : " + randomArray[i+1] + " : " + randomArray[i+2]);
					isLinearNumber = true;
					break;
				} else {
					isLinearNumber = false;
				}
			}
			

			// 문자열로 변환
			randomString = "";
			for (int i=0; i<6; i++) {
				randomString += randomArray[i] + "/";
			}
			randomString = randomString.substring(0, randomString.length()-1);
			
			
			// 기존 번호와 비교
			for (int i=0; i<oldNumber.length; i++) {
				if(randomString.equals(oldNumber[i])) {
					isSameOldNumber = true;
					break;
				} else {
					isSameOldNumber = false;
				}
			}
			
			
			// 최종 판단
			if(isSameNumber || isLinearNumber || isSameOldNumber) {
				System.out.println("다시 시도 해 주세요 : " + randomString);
			} else {
				System.out.println("행운이 있기를 : " + randomString);
			}
			
			
			System.out.println("");
		
		}
		*/
		// 			내 코드
			
		int[] lotto = new int[45];
        for (int i = 0; i < 45; i++) {
            lotto[i] = i + 1;
        }
       // System.out.println(Arrays.toString(lotto));
       // System.out.println("------------------------------------");
        
        Random pick = new Random();
        int[] nums = new int[6];
        int count = 0;
       
        while (count < 6) {
            int index = pick.nextInt(45);
            int number = lotto[index];
            if (number != 0) {
                boolean xnum = false;
                for (int i = 0; i < count; i++) {
                	if (nums[i] == number) {
                    	xnum = true;
                        break;
                		}
                	 }                          
                if (!xnum) {
                    nums[count] = number;
                    lotto[index] = 0;
                    count++;
                }
            }
        }

        Arrays.sort(nums);
        for(int k =0;k<=4;k++){
        	if(nums[k]+1!=nums[k+1]&&nums[k+1]+1!=nums[k+2])
        	{
        		break;	
        	}else {
        		//else by
        	}
        	
        }
        System.out.println(Arrays.toString(nums));
    	System.out.println("---------------------------");
        if (oldNumber.toString()!='"'+nums.toString()+'"') {
        	System.out.println(Arrays.toString(nums));
        }else {
        	System.out.println("다시돌려주세요.");
        }
        
	}

}
