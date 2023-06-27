package com.logic.beans;

import java.util.ArrayList;
import java.util.List;

/**
* @description 属性集合
* @author Logic
* @date 2023/6/27 14:55
* @version 1.0
*/
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    /**
     * @description 添加属性
     * @param pv
     * @return void
     * @author Logic
     * @date 2023/6/27 14:58
    */
    public void addPropertyValue(PropertyValue pv){
        this.propertyValueList.add(pv);
    }

    /**
     * @description 将属性集合转换为数组并返回
     *
     * @return com.logic.beans.PropertyValue[]
     * @author Logic
     * @date 2023/6/27 14:58
    */
    public PropertyValue[] getPropertyValues(){
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    /**
     * @description 获取对应属性名的单个属性
     * @param propertyName
     * @return com.logic.beans.PropertyValue
     * @author Logic
     * @date 2023/6/27 14:58
    */
    public PropertyValue getPropertyValue(String propertyName){
        for (PropertyValue pv : propertyValueList) {
            if (pv.getName().equals(propertyName)){
                return pv;
            }
        }
        return null;
    }
}
