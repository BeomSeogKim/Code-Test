# Grammar Of Java

## 1. 문자열
- String(str)을 문자열로 변환 : str.toCharArray()
- String 대문자로 변환 : .toUpperCase()
- String 소문자로 변환 : .toLowerCase()
- char 대문자로 변환 : Character.toUpperCase()
- char 소문자로 변환 : Character.toLowerCase()
- char 대문자/소문자 확인 : Character.isLowerCase() // Charactoer.isUpperCase()
- String 에서(str) 특정 단어가 있는지 확인 : str.indexOf('특정 단어')
- 문자 자르기 : str.subtstring(a, b) // str.substring(a)
- Character 가 alphabet 인지 확인 : Character.isAlphabetic
- String으로 저장된 문자열 중 한 글자만 선택해 char 타입으로 변환 : str.charAt()
- 대소문자 구분하여 비교 : equals
- 대소문자 구분하지 않고 비교 : equalsIgnoreCase
- Char이 숫자인지 확인하는 방법 :Character.isDigit(char)

## 2. 배열 
- 배열 오름차순 구하기 : Arrays.sort(arr)

## 3. HashMap & TreeSet
- 키에 해당하는 value 가져오기 : map.get(key)
- map의 크기 확인 : map.size()
- map에 키가 있는 지 확인 : map.containsKey(key)
- map에서 특정 키 삭제 : map.remove(key)
- map의 key들 추출 : map.keySet()


## Etc. 정규식
- ^ : 부정 
- A-Z : 대문자 알파벳
- a-z : 소문자 알파벳