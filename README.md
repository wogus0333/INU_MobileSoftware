# INU - MobileSoftware

</br>

* [Assignment 1](#Assignment-1)
* [Assignment 2](#Assignment-2)
* [Assignment 3](#Assignment-3)
* [Assignment 4](#Assignment-4)
* [Assignment 5](#Assignment-5)
* [Assignment 6](#Assignment-6)
* [Assignment 7](#Assignment-7)
* [Assignment 8](#Assignment-8)
* [Final Test](#Final-Test)

</br>

## Assignment 1

###### 제출 일자 : 2020.09.11

### 실행 화면

안드로이드 스튜디오 설치

![alt text](https://github.com/wogus0333/INU_MobileSoftware/blob/main/1_Assignment_안드로이드스튜디오설치.PNG)

</br>

</br>

## Assignment 2

###### 제출 일자 : 2020.09.26

### 실행 화면

Project 4-1 (간단한 계산기)

![alt text](https://github.com/wogus0333/INU_MobileSoftware/blob/main/2_Assignment/프로젝트4-1/add.PNG)

![alt text](https://github.com/wogus0333/INU_MobileSoftware/blob/main/2_Assignment/프로젝트4-1/sub.PNG)

![alt text](https://github.com/wogus0333/INU_MobileSoftware/blob/main/2_Assignment/프로젝트4-1/mul.PNG)

![alt text](https://github.com/wogus0333/INU_MobileSoftware/blob/main/2_Assignment/프로젝트4-1/div.PNG)

</br>

### 코드 설명

**setOnTouchListener**

> MainActivity.kt

1. 버튼을 눌렀을 때 입력한 EditText에 입력한 두 수를 Integer.parseInt()를 사용하여 정수형으로 변환 후 사칙연산 진행


```Kotlin
		btnAdd.setOnTouchListener { view, motionEvent ->
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            result = Integer.parseInt(num1) + Integer.parseInt(num2)
            textResult.text = "계산 결과 : " + result.toString()
            false
        }

        btnSub.setOnTouchListener { view, motionEvent ->
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            result = Integer.parseInt(num1) - Integer.parseInt(num2)
            textResult.text = "계산 결과 : " + result.toString()
            false
        }

        btnMul.setOnTouchListener { view, motionEvent ->
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            result = Integer.parseInt(num1) * Integer.parseInt(num2)
            textResult.text = "계산 결과 : " + result.toString()
            false
        }

        btnDiv.setOnTouchListener { view, motionEvent ->
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            result = Integer.parseInt(num1) / Integer.parseInt(num2)
            textResult.text = "계산 결과 : " + result.toString()
            false
```

</br>

> activity_main.xml

1. LinearLayout 사용
2. orientation을 "vertical"로 지정하여 위에서 아래 방향으로 뷰 배치
3. layout_margin을 사용항 뷰와 뷰 그룹간 거리를 조정

```Kotlin
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_height="match_parent"
    android:layout_width="match_parent"
    android:orientation="vertical">
    <EditText
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/Edit1"
        android:layout_margin="10dp"
        android:hint="숫자1"/>
    
	...

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/BtnAdd"
        android:layout_margin="10dp"
        android:text="더하기"/>

    ...

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/TextResult"
        android:textSize="30dp"
        android:textColor="#FF0000"
        android:layout_margin="10dp"
        android:text="계산 결과 : "/>
</LinearLayout>
```

</br>

### 실행 화면

Project 4-2 (애완동물 사진 보기)

![alt text](https://github.com/wogus0333/INU_MobileSoftware/blob/main/2_Assignment/프로젝트4-2/실행1.PNG)

![alt text](https://github.com/wogus0333/INU_MobileSoftware/blob/main/2_Assignment/프로젝트4-2/실행2.PNG)

![alt text](https://github.com/wogus0333/INU_MobileSoftware/blob/main/2_Assignment/프로젝트4-2/실행3.PNG)

![alt text](https://github.com/wogus0333/INU_MobileSoftware/blob/main/2_Assignment/프로젝트4-2/실행4_dog.PNG)

![alt text](https://github.com/wogus0333/INU_MobileSoftware/blob/main/2_Assignment/프로젝트4-2/실행4_cat.PNG)

![alt text](https://github.com/wogus0333/INU_MobileSoftware/blob/main/2_Assignment/프로젝트4-2/실행4_rabbit.PNG)

</br>

### 코드 설명

**setOnCheckedChangeListener**

> MainActivity.kt

1. CheckBox에 항목이 체크되면 특정 TextView, RadioGroup, Button, ImageView가 android.view.View.VISIBLE을 통하여 화면에 보여짐
2. 반대로 체크되지 않으면 android.view.View.INVISIBLE을 통하여 화면에 보이지 않음

```Kotlin
chkAgree = findViewById<CheckBox>(R.id.ChkAgree)

		chkAgree.setOnCheckedChangeListener { compoundButton, b ->
            if(chkAgree.isChecked == true){
            text2.visibility = android.view.View.VISIBLE
            rGroup1.visibility = android.view.View.VISIBLE
            btnOK.visibility = android.view.View.VISIBLE
            imgPet.visibility = android.view.View.VISIBLE
        } else {
                text2.visibility = android.view.View.INVISIBLE
                rGroup1.visibility = android.view.View.INVISIBLE
                btnOK.visibility = android.view.View.INVISIBLE
                imgPet.visibility = android.view.View.INVISIBLE
            }
        }
```

</br>

**setOnClickListener**

> MainActivity.kt

1. Button을 눌렀을 때 RadioGroup 내에 체크가 된 RadioButton의 Id가 있으면 ImageView에 setImageResource()를 사용하여 이미지 지정

```Kotlin
		btnOK.setOnClickListener {
            when (rGroup1.checkedRadioButtonId){
                R.id.RdoDog -> imgPet.setImageResource(R.drawable.dog)
                R.id.RdoCat -> imgPet.setImageResource(R.drawable.cat)
                R.id.RdoRabbit -> imgPet.setImageResource(R.drawable.rabbit)
            }
        }
```

</br>

> activity_main.xml

1. LinearLayout 사용
2. orientation을 "vertical"로 지정하여 위에서 아래 방향으로 뷰 배치
3. padding을 사용하여 뷰와 뷰 안에 있는 내용의 간격을 조정(해당 코드에서는 전체 뷰 그룹과 뷰들 간 거리)
4. visibility="invisible" 코드를 사용하여 해당 뷰가 보이지 않게 함

```Kotlin
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="10dp">
    
	...

    <TextView
        android:id="@+id/Text2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="좋아하는 애완동물은?"
        android:textSize="25dp"
        android:visibility="invisible" />

    <RadioGroup
        android:id="@+id/Rgroup1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:visibility="invisible">
        <RadioButton
            android:id="@+id/RdoDog"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="강아지" />
        
		...

    </RadioGroup>

    <Button
        android:id="@+id/BtnOK"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="선택 완료"
        android:visibility="invisible" />
    <ImageView
        android:id="@+id/ImgPet"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:visibility="invisible" />
</LinearLayout>
```

</br>

</br>



## Assignment 3

###### 제출 일자 : 2020.10.16

### 실행 화면

로그인

![alt text](https://github.com/wogus0333/INU_MobileSoftware/blob/main/3_Assignment/로그인/로그인 성공.PNG)

![alt text](https://github.com/wogus0333/INU_MobileSoftware/blob/main/3_Assignment/로그인/로그인 실패.PNG)

![alt text](https://github.com/wogus0333/INU_MobileSoftware/blob/main/3_Assignment/로그인/아이디만입력.PNG)

![alt text](https://github.com/wogus0333/INU_MobileSoftware/blob/main/3_Assignment/로그인/이름만입력.PNG)

</br>

### 코드 설명

**setOnTouchListener**

> MainActivity.kt

1. Button을 눌렀을 때 id가 201501494이고 passwd가 "한재현"이 입력된 경우에만 로그인 성공

```Kotlin
		button.setOnTouchListener { v, event ->
            var id_num = input_id.text.toString()
            var passwd_str = input_passwd.text.toString()
            if (passwd_str.isEmpty() || id_num.isEmpty())
                result.text = "결과 :"
            else {
                if (id == Integer.parseInt(id_num) && passwd == passwd_str)
                    result.text = "결과 : 로그인 성공"
                else if (id == Integer.parseInt(id_num) || passwd == passwd_str)
                    result.text = "결과 : 로그인 실패"
            }
            false
        }
```

</br>

## Assignment 4

###### 제출 일자 : 2020.11.13

### 실행 화면

시간 예약

![alt text](https://github.com/wogus0333/INU_MobileSoftware/blob/main/4_Assignment/실습6-1.gif)

</br>

### 코드 설명

**SystemClock.elapsedRealtime()**

> MainActivity.kt

1. 예약 시작 Button을 누르면 chronometer 위젯에 SystemClock.elapsedRealtime()을 base로 하여 start() 이후 시간을 알려준다.(버튼을 누른 순간부터 시간이 흐름)
2. 시간 설정 RadioButton을 눌러서 TimePicker를 통하여 시간을 정한다.
3. 날짜 설정 RadioButton을 눌러서 년/월/일을 정한다.
4. 예약완료 Button을 누르면 chronometer.stop()으로 시간을 멈춘 후 하단 TextView에 년월일시간을 표시한다.

```Kotlin
title = "시간 예약"

        rdoCal.setOnClickListener{
            timePicker1.visibility = View.INVISIBLE
            calendarView1.visibility = View.VISIBLE
        }
        rdoTime.setOnClickListener {
            timePicker1.visibility = View.VISIBLE
            calendarView1.visibility = View.INVISIBLE
        }
        btnStart.setOnClickListener {
            chronometer1.base = SystemClock.elapsedRealtime()
            chronometer1.start()
            chronometer1.setTextColor(Color.RED)
        }
        btnEnd.setOnClickListener {
            chronometer1.stop()
            chronometer1.setTextColor(Color.BLUE)
            tvYear.text = selectYear.toString()
            tvMonth.text = selectMonth.toString()
            tvDay.text = selectDay.toString()
            tvHour.text = (timePicker1.currentHour).toString()
            tvMinute.text = (timePicker1.currentMinute).toString()
        }
        calendarView1.setOnDateChangeListener { view, year, month, dayOfMonth ->
            selectYear = year
            selectMonth = month + 1
            selectDay = dayOfMonth
        }
```

</br>

> activity_main.xml

1. LinearLayout 사용
2. orientation을 "vertical"로 지정하여 위에서 아래 방향으로 뷰 배치
3. Chronometer : format을 사용하여 시간을 출력, gravity를 사용하여 자신의 뷰에서 포함하고 있는 데이터를 center로 정렬
4. CalendarView : showWeekNumber를 false로 설정하여 왼쪽에 주차를 보여주는 기능 제거
5. TimePicker : AM, PM, 시, 분을 설정할 수 있음

```Kotlin
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical" >

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical" >

        <Chronometer
            android:id="@+id/chronometer1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:format=" 예약에 걸린 시간  %s "
            android:gravity="center"
            android:textSize="20dp" />

       ...

    </LinearLayout>

    <RadioGroup
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" >

        <RadioButton
            android:id="@+id/rdoCal"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="날짜 설정 (캘린더뷰)" />

        ...

    </RadioGroup>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="0dip"
        android:layout_weight="1" >

        <FrameLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:gravity="center" >

            <CalendarView
                android:id="@+id/calendarView1"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:showWeekNumber="false" />

            <TimePicker
                android:timePickerMode="spinner"
                android:id="@+id/timePicker1"
                android:layout_width="match_parent"
                android:layout_height="match_parent" />
        </FrameLayout>
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="#CCCCCC" >

        <Button
            android:id="@+id/btnEnd"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="예약완료" />

        <TextView
            android:id="@+id/tvYear"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="0000" />

        ...

    </LinearLayout>

</LinearLayout>
```

</br>

</br>

