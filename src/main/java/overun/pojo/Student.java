package overun.pojo;

import lombok.Data;


/**
 * @ClassName: Student
 * @Description:
 * @author: 壹米滴答-西安-ZhangPY
 * @version: V1.0
 * @date: 2020/2/11
 * @Copyright: 2019 www.yimidida.com Inc. All rights reserved.
 */
@Data
public class Student {

    /** 学号 */
    private String studentId;
    /** 姓名 */
    private String name;
    /** 总分 */
    private Integer totalScore;


}
