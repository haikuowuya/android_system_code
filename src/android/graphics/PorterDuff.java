/*
 * Copyright (C) 2006 The Android Open Source Project Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law
 * or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package android.graphics;

import android.annotation.SuppressLint;

@SuppressLint("NewApi")
/**
 * 绘制在canvas上内容显示模式 
 */
public class PorterDuff
{
	/* http://blog.csdn.net/q445697127/article/details/7867529 */
	// these value must match their native equivalents. See SkPorterDuff.h
	public enum Mode
	{
		/** [0, 0] */
		/**
		 * 所绘制不会提交到画布上。
		 */
		CLEAR(0),
		/** [Sa, Sc] */
		/**
		 * 显示上层绘制图片
		 */
		SRC(1),
		/** [Da, Dc] */
		/**
		 * 显示下层绘制图片
		 */
		DST(2),
		/** [Sa + (1 - Sa)*Da, Rc = Sc + (1 - Sa)*Dc] */
		/***
		 *正常绘制显示，上下层绘制叠盖。
		 */
		SRC_OVER(3),
		/** [Sa + (1 - Sa)*Da, Rc = Dc + (1 - Da)*Sc] */
		DST_OVER(4),
		/** [Sa * Da, Sc * Da] */
		SRC_IN(5),
		/** [Sa * Da, Sa * Dc] */
		DST_IN(6),
		/** [Sa * (1 - Da), Sc * (1 - Da)] */
		SRC_OUT(7),
		/** [Da * (1 - Sa), Dc * (1 - Sa)] */
		DST_OUT(8),
		/** [Da, Sc * Da + (1 - Sa) * Dc] */
		SRC_ATOP(9),
		/** [Sa, Sa * Dc + Sc * (1 - Da)] */
		DST_ATOP(10),
		/** [Sa + Da - 2 * Sa * Da, Sc * (1 - Da) + (1 - Sa) * Dc] */
		XOR(11),
		/**
		 * [Sa + Da - Sa*Da, Sc*(1 - Da) + Dc*(1 - Sa) + min(Sc, Dc)]
		 */
		DARKEN(12),
		/**
		 * [Sa + Da - Sa*Da, Sc*(1 - Da) + Dc*(1 - Sa) + max(Sc, Dc)]
		 */
		LIGHTEN(13),
		/** [Sa * Da, Sc * Dc] */
		MULTIPLY(14),
		/** [Sa + Da - Sa * Da, Sc + Dc - Sc * Dc] */
		SCREEN(15),
		/** Saturate(S + D) */
		ADD(16), OVERLAY(17);

		Mode(int nativeInt)
		{
			this.nativeInt = nativeInt;
		}

		/**
		 * @hide
		 */
		public final int nativeInt;
	}
 
}
//1.PorterDuff.Mode.CLEAR
//所绘制不会提交到画布上。
//
//2.PorterDuff.Mode.SRC
//显示上层绘制图片
//
//3.PorterDuff.Mode.DST
//显示下层绘制图片
//
//4.PorterDuff.Mode.SRC_OVER
//正常绘制显示，上下层绘制叠盖。
//
//5.PorterDuff.Mode.DST_OVER
//上下层都显示。下层居上显示。
//
//6.PorterDuff.Mode.SRC_IN
//取两层绘制交集。显示上层。
//
//7.PorterDuff.Mode.DST_IN
//取两层绘制交集。显示下层。
//
//8.PorterDuff.Mode.SRC_OUT
//取上层绘制非交集部分。
//
//9.PorterDuff.Mode.DST_OUT
//取下层绘制非交集部分。
//
//10.PorterDuff.Mode.SRC_ATOP
//取下层非交集部分与上层交集部分
//
//11.PorterDuff.Mode.DST_ATOP
//取上层非交集部分与下层交集部分
//
//12.PorterDuff.Mode.XOR
//取两层绘制非交集。两层绘制非交集。
//
//13.PorterDuff.Mode.DARKEN
//上下层都显示。变暗
//
//14.PorterDuff.Mode.LIGHTEN
//上下层都显示。变量
//
//15.PorterDuff.Mode.MULTIPLY
//取两层绘制交集
//
//16.PorterDuff.Mode.SCREEN
//上下层都显示。
