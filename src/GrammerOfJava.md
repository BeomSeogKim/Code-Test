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