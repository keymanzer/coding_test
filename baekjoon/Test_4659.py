'''
[백준] 4659_비밀번호 발음하기 (문자열, 실버5)
참고:
https://velog.io/@holawan/백준-4659비밀번호-발음하기-python
1. a e i o u 모음 하나를 반드시 포함
2. 모음 3개 혹은 자음이 3개 연속으로 오면 안된다
모음<3, 자음<3
l<2, except "ee" and "oo"
'''

import sys

vowel = {'a','e','i','o','u'}

while True:
    word = sys.stdin.readline().strip()
    if word == 'end':
        break

    # 단어에 모음이 1개 미만일 경우
    cnt = 0
    for w in word:
        if w in vowel:
            cnt += 1
            break
    if cnt < 1:
        print('<'+word+'>'+' is not acceptable.')
        continue

    # 모음이 3개 혹은 자음이 3개 연속으로오면 안됨
    cnt = 0
    for i in range(len(word)-2):
        if (word[i] in vowel) and (word[i+1] in vowel) and (word[i+2] in vowel):
            cnt += 1
            break
        elif (word[i] not in vowel) and (word[i+1] not in vowel) and (word[i+2] not in vowel):
            cnt += 1
            break
    if cnt == 1:
        print('<'+word+'>'+' is not acceptable.')
        continue

    # 같은 글자가 연속적으로 두번 오면 안되나, ee와 oo는 허용한다
    cnt = 0
    for i in range(len(word)-1):
        if word[i] == word[i+1]:
            if ((word[i] == 'e') and (word[i+1] == 'e')) or ((word[i] == 'o') and (word[i+1] == 'o')):
                continue
            cnt += 1
            break
    if cnt == 1:
        print('<'+word+'>'+' is not acceptable.')
        continue

    # 모든 예외 케이스 통과하면 적합
    print('<'+word+'>'+' is acceptable.')