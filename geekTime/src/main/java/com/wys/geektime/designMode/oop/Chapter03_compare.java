package com.wys.geektime.designMode.oop;

/**
 * @author wangyasheng
 * @date 2021/1/25
 * @Describe:面向对象与面向过程比较
 */

/**
 * 1、什么是面向过程编程？
 *
 * 面向过程编程是以过程（或方法、函数、操作）作为组织代码的基本单元。
 * 它最主要的特点是数据和方法分离。
 */

/**
 * 2、面向对象编程相比面向过程编程有哪些优势？
 *
 * 优势主要有三个：
 * a、对于大规模复杂程序的开发，程序的处理流程并非单一的一条主线，
 * 而是错综复杂的网状结构。面向对象编程比起面向过程编程，更能应对
 * 复杂的程序开发。
 *
 * b、面向对象编程相比较面向过程编程，具有更加丰富的特性（封装、抽象、
 * 继承、多态）。利用这些特性编写出来的代码，更加易扩展、易服用、易维护。
 *
 * c、面向对象编程语言比面向过程编程语言，更加人性化、更高级、更加智能。
 */

/**
 * tips：既然面向对象编程比面向过程编程更加容易应对大规模
 * 复杂程序的开发。但是像Unix、Linux这些复杂的系统，也都是
 * 基于C语言这种面向过程的编程语言开发的，怎么看待这个现象？
 *
 * 解答：
 * 使用任何一个编程语言编写的程序，最终执行上都要落实到CPU
 * 一条一条指令的执行（无论通过虚拟机解释执行，还是直接编译为
 * 机器码），CPU看不到是使用何种语言编写的程序。对于所有编程
 * 语言最终目的是两种：提高硬件的运行效率和提高程序员的开发效率。
 *
 * 然而这两种很难兼得。C语言在效率方面几乎做到了极致，它更
 * 适合挖掘硬件的价值，从执行效率方面看，开发操作系统和贴近
 * 硬件的底层程序，C语言是极好的选择。
 *
 * C语言带来的问题是内存越界、野指针、内存泄露等。它只关心程序员
 * 飞的高不高，不关心程序员飞的累不累。为了解脱程序员，提高开发效率，
 * 设计了OOP等更加"智能"的编程语言，但是开发容易毕竟来源于对
 * 底层的一层一层的包装。完成一个特定操作有了更多的中间环节，占用
 * 了更大的内存空间，占用了更多的CPU运算。从这个角度看OOP这种高级
 * 语言的流行是因为硬件越来越便宜了，性能也越来越好。
 */
class Chapter03_compare {
}
