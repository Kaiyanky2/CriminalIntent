package com.app.wangkaiyan.criminalintent.Model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 单例，用来存储Crime对象
 * Created by wangkaiyan on 2016/8/11.
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;

    private List<Crime> mCrimes; //保存Crime对象的数组

    //得到单例类CrimeLab的对象
    public static CrimeLab get(Context context){
        if(sCrimeLab == null){
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    //私有的构造方法
    private CrimeLab(Context context){
        mCrimes = new ArrayList<>();

        //暂时增加100个Crime
        for (int i = 0; i < 100; i++){
            Crime crime = new Crime();
            crime.setTitle("Crime # " + i);
            crime.setSolved(i % 2 == 0);
            mCrimes.add(crime);
        }
    }

    //返回Crime数组列表
    public List<Crime> getCrimes(){
        return mCrimes;
    }

    //返回带有指定ID的Crime对象
    public Crime getCrime(UUID id){
        for (Crime crime: mCrimes){
            if (crime.getId().equals(id)){
                return crime;
            }
        }
        return null;
    }
}
