package overun;


import overun.pojo.Student;
import overun.utils.CsvUtils;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName: app
 * @Description:
 * @author: 壹米滴答-西安-ZhangPY
 * @version: V1.0
 * @date: 2020/2/11
 * @Copyright: 2019 www.yimidida.com Inc. All rights reserved.
 */
public class app {


    public static void main(String[] args) {
        /** 原始数据 */
        List<Student> students = CsvUtils.achievementRead("C:\\\\Users\\\\ZhangPY\\\\Desktop\\\\student-测试题(1).csv");
        /** 排序后数据 */
        List<Student> collect = students.stream().
                sorted(Comparator.comparing(Student::getTotalScore,Comparator.reverseOrder()).
                        thenComparing(Student::getStudentId,Comparator.reverseOrder())).
                collect(Collectors.toList());
        /** 遍历 */
        collect.forEach(item -> {
            System.out.println(item.toString());
        });
    }
}
