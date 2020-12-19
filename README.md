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
2. 시간 설정 RadioButton을 눌러서 TimePicker를 통하여 시간을 정함
3. 날짜 설정 RadioButton을 눌러서 년/월/일을 정함
4. 예약완료 Button을 누르면 chronometer.stop()으로 시간을 멈춘 후 하단 TextView에 년월일시간을 표시</br>

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

## Assignment 5

###### 제출 일자 : 2020.11.13

### 실행 화면

AlterDialog / Toast Message

![alt text](https://github.com/wogus0333/INU_MobileSoftware/blob/main/5_Assignment/1_초기화면.PNG)

![alt text](https://github.com/wogus0333/INU_MobileSoftware/blob/main/5_Assignment/2_button1누름.PNG)

![alt text](https://github.com/wogus0333/INU_MobileSoftware/blob/main/5_Assignment/3_EditText입력.PNG)

![alt text](https://github.com/wogus0333/INU_MobileSoftware/blob/main/5_Assignment/4_확인.PNG)

![alt text](https://github.com/wogus0333/INU_MobileSoftware/blob/main/5_Assignment/5_취소.PNG)

</br>

### 코드 설명

**AlterDialog / ToastMessage**

> MainActivity.kt

1. R.layout.dialog1의 view를 inflate(메모리에 객체화)
2. dlg에 AlterDialog .Builder 객체를 생성
3. dlg에 setIcon을 통해 Icon을 설정하고 setView를 통해 dialogView를 세팅
4. setPositiveButton("확인")을 통하여 버튼을 설정하고 눌렀을 경우 EditText에 입력한 이름과 이메일이 activity_main.xml의 TextView로 이동됨
5. setNegativeButton("취소")을 통하여 버튼을 설정하고 눌렀을 경우 ToastMessage가 출력됨
6. toastView에 R.layout.toast1의 view를 inflate
7. toastView안에 있는 TextView에 "취소했습니다." 문자열 저장
8. toast.view에 세팅한 toastView를 저장하고 show()를 사용하여 출력

```Kotlin
button1.setOnClickListener {
            dialogView = View.inflate(this, R.layout.dialog1, null)
            val dlg = AlertDialog.Builder(this)
            dlg.setTitle("사용자 정보 입력")
            dlg.setIcon(R.drawable.ic_menu_allfriends)
            dlg.setView(dialogView)
            dlg.setPositiveButton("확인"){dialog, which ->
                dlgEdtName = dialogView.findViewById<EditText>(R.id.dlgEdt1)
                dlgEdtEmail = dialogView.findViewById<EditText>(R.id.dlgEdt2)

                tvName.text = dlgEdtName.text.toString() // Edt_name
                tvEmail.text = dlgEdtEmail.text.toString() // Edt_email
            }
            dlg.setNegativeButton("취소"){dialog, which ->
                val toast = Toast(this)
                toastView = View.inflate(this,R.layout.toast1, null)
                toastText = toastView.findViewById<TextView>(R.id.toastText1)
                toastText.text = "취소했습니다."
                toast.view = toastView
                toast.show()
            }
            dlg.show()
        }
```

</br>

</br>

## Assignment 6

###### 제출 일자 : 2020.11.27

### 실행 화면

인텐트

<img src="https://github.com/wogus0333/INU_MobileSoftware/blob/main/6_Assignment/6_Assignment.gif" height="800px" width="360px">

</br>

### 코드 설명

**app1. Intent / startActivity**

> MainActivity.kt

1. Button을 눌러 SecondActivity로 이동

```Kotlin
btnNewActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
```

</br>

**app1. finish**

> SecondActivity.kt

1. Button을 눌러 finish()를 통해 Activity 종료

```Kotlin
btnReturn.setOnClickListener {
            finish()
        }
```

</br>

**app2. intent.putExtra**

> MainActivity.kt

1. Button을 눌러 ResultActivity로 이동할 때 voteCount랑 imgName을 "VoteCount"와 "ImageName"으로 전달

```Kotlin
btnFinih.setOnClickListener {
            val intent = Intent(applicationContext, ResultActivity::class.java)
            intent.putExtra("VoteCount", voteCount)
            intent.putExtra("ImageName", imgName)
            startActivity(intent)
        }
```

</br>

**app2. intent.getExtra**

> ResultActivity.kt

1. 자료형에 맞게 각각 getIntArrayExtra("VoteCount"), getStringArrayExtra("ImageName")으로 전달받음

```Kotlin
val intent = intent
val voteResult = intent.getIntArrayExtra("VoteCount")
val imageName = intent.getStringArrayExtra("ImageName")
```

</br>

**app3. startActivityForResult / onActivityResult**

> MainActivity.kt

1. startActivityForResult()로 SecondActivity 호출 : 인자로 intent와 Request_code를 사용
2. Request_code : onActivityResult()에서 여러 개의 startActivityForResult()를 구분하게 해주는 코드
3. onActivityResult() : 호출된 Activity에서 저장한 결과를 돌려줌, requestCode, resultCode, Intent를 인자로 받음

```Kotlin
btnNewActivity.setOnClickListener {
            var intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("Num1", Integer.parseInt(edtNum1.text.toString()))
            intent.putExtra("Num2", Integer.parseInt(edtNum2.text.toString()))
            startActivityForResult(intent, 0) // 0 : Request_code
        }

override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == Activity.RESULT_OK){
            var hap = data!!.getIntExtra("Hap", 0)
            Toast.makeText(this,"합계 : $hap", Toast.LENGTH_SHORT).show()
        }
    }
```

</br>

**app3. setResult**

> SecondActivity.kt

1. setResult() : 결과 저장 (Result_code : RESULT_OK, RESULT_CANCEL)

```Kotlin
btnReturn.setOnClickListener {
            var outIntent = Intent(this,MainActivity::class.java)
            outIntent.putExtra("Hap", hapValue)
            setResult(Activity.RESULT_OK,outIntent)
            finish()
        }
```

</br>

**app4. 암시적 인텐트**

> MainActivity.kt

1. 전화 : 액션(ACTION_DAIL), Uri(tel:010-1234-5678)
2. 나머지도 비슷한 원리

```Kotlin
btnDial.setOnClickListener {
            var uri = Uri.parse("tel:010-1234-5678")
            var intent = Intent(Intent.ACTION_DIAL, uri)
            startActivity(intent)
        }

        btnWeb.setOnClickListener {
            var uri = Uri.parse("http://www.hanbit.co.kr")
            var intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        btnGoogle.setOnClickListener {
            var uri = Uri.parse("https://maps.google.com/maps?q="
            + 37.559133 + "," + 126.927824)
            var intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        btnSearch.setOnClickListener {
            var intent = Intent(Intent.ACTION_WEB_SEARCH)
            intent.putExtra(SearchManager.QUERY,"안드로이드")
            startActivity(intent)
        }

        btnSms.setOnClickListener {
            var intent = Intent(Intent.ACTION_SENDTO)
            intent.putExtra("sms_body","안녕하세요?")
            intent.data = Uri.parse("smsto:" + Uri.encode("010-1234-4567"))
            startActivity(intent)
        }

        btnPhoto.setOnClickListener {
            var intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }
```

</br>

</br>

## Assignment 7

###### 제출 일자 : 2020.12.04

### 실행 화면

GridView / Gallery

![alt text](https://github.com/wogus0333/INU_MobileSoftware/blob/main/7_Assignment/11-1.PNG)

![alt text](https://github.com/wogus0333/INU_MobileSoftware/blob/main/7_Assignment/11-2.PNG)

</br>

### 코드 설명

**app1. GridView / Adapter**

> MainActivity.kt

1. Adapter 
   - 데이터 테이블을 목록 형태로 보여주기 위해 사용되는 것으로 데이터를 다양한 형식의 리스트 형식으로 보여주기 위해서 데이터와 리스트 뷰 사이에 존재하는 객체 (한마디로 데이터와 리스트 뷰 사이의 통신을 위한 다리 역할)
   - Adapter View가 출력할 수 있는 데이터로 만들어 놓는 공간, Adapter View는 이 데이터를 출력하는 역할
2. Adapter View 
   - 많은 정보를 효과적으로 처리하기 위해, View에 직접 정보를 주입하지 않고, Adapter라는 중간 매개체를 이용하기 때문에 붙여진 이름
   - ViewGroup을 상속받으므로 내부적으로 많은 뷰들을 담을 수 있음
   - 대표적인 Adapter View의 서브 클래스로는 ListView, GridView, Spinner, Gallery 등이 있음
3. MyGridAdapter
   - BaseAdapter의 상속을 받음
   - Implement methods : getCount(), getItem(), getItemId(), getView()
   - getCount() : posterID.size를 리턴하여 데이터 개수만큼의 크기를 반환한다.
   - getView() : 인자로 받은 위치의 데이터가 화면에 표시될 뷰 반환
     - LayoutParams() : 폭과 높이 파라미터 설정
     - ScaleType.FIT_CENTER : 원본 크기 그대로 보여줌(가운데 정렬)
     - AlertDaialog 사용하여 포스터 이미지, 포스터 제목, 아이콘 등을 출력

```Kotlin
var gv = findViewById<View>(R.id.gridView1) as GridView
        var gAdapter = MyGridAdapter(this)
        gv.adapter = gAdapter
    }

    inner class MyGridAdapter(var context: Context) : BaseAdapter(){
        var posterID = arrayOf(
            R.drawable.mov01, R.drawable.mov02, R.drawable.mov03, R.drawable.mov04,
            R.drawable.mov05, R.drawable.mov06, R.drawable.mov07, R.drawable.mov08,
            R.drawable.mov09, R.drawable.mov10
        )
        var posterName = arrayOf(
            "써니", "완득이", "괴물", "라디오스타", "비열한 거리", "왕의 남자", "아일랜드",
            "웰컴투 동막골", "헬보이", "Back to the future"
        )

        override fun getCount(): Int {
            return posterID.size
        }

        override fun getItem(position: Int): Any {
            return 0
        }

        override fun getItemId(position: Int): Long {
            return 0
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var imageview = ImageView(context)
            imageview.layoutParams = ViewGroup.LayoutParams(200,300)
            imageview.scaleType = ImageView.ScaleType.FIT_CENTER
            imageview.setPadding(5,5,5,5)

            imageview.setImageResource(posterID[position])
            imageview.setOnClickListener{
                var dialogView = View.inflate(this@MainActivity,R.layout.dialog,null)
                var dlg = AlertDialog.Builder(this@MainActivity)
                var ivPoster = dialogView.findViewById<ImageView>(R.id.ivPoster)
                ivPoster.setImageResource(posterID[position])
                dlg.setTitle(posterName[position])
                dlg.setIcon(R.drawable.movie_icon)
                dlg.setView(dialogView)
                dlg.setNegativeButton("닫기", null)
                dlg.show()
            }
            return imageview
        }
```

</br>

**app2. Gallery**

> MainActivity.kt

1. GalleryView
   - 항목들이 수평으로 스크롤되면서 중심에 놓인 현재 항목을 강조

```Kotlin
val gallery = findViewById<Gallery>(R.id.gallery1)
        val galAdapter = MyGalleryAdapter(this)
        gallery.adapter = galAdapter
    }

    inner class MyGalleryAdapter(var context: Context) : BaseAdapter(){
        var posterID = arrayOf(
            R.drawable.mov11, R.drawable.mov12, R.drawable.mov13, R.drawable.mov14,
            R.drawable.mov15, R.drawable.mov16, R.drawable.mov17, R.drawable.mov18,
            R.drawable.mov19, R.drawable.mov20
        )
        var posterName = arrayOf(
            "여인의 향기", "쥬라기 공원", "포레스트 검프", "Groundhog Day", "혹성탈출",
            "아름다운 비행", "내 이름은 칸", "해리포터", "마더", "킹콩을 들다"
        )
        override fun getCount(): Int {
            return posterID.size
        }
        override fun getItem(position: Int): Any {
            return 0
        }
        override fun getItemId(position: Int): Long {
            return 0
        }
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val imageview = ImageView(context)
            imageview.layoutParams = Gallery.LayoutParams(200,300)
            imageview.scaleType = ImageView.ScaleType.FIT_CENTER
            imageview.setPadding(5,5,5,5)

            imageview.setImageResource(posterID[position])

            imageview.setOnClickListener{
                var ivPoster = findViewById<ImageView>(R.id.ivPoster)
                ivPoster.scaleType = ImageView.ScaleType.FIT_CENTER
                ivPoster.setImageResource(posterID[position])
                false
                var toast = Toast(this@MainActivity)
                toastView = View.inflate(this@MainActivity, R.layout.movie_toast, null)
                toastText = toastView.findViewById<TextView>(R.id.tv_movie_title)
                toastText.text = posterName[position]
                toast.view = toastView
                toast.show()
            }
            return imageview
        }
```

</br>

</br>