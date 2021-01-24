Git - good practices

* commit powinien mieć dobry opis.
* commit powinien zawierać jedną zmianę.
* zmiana opisu tylko dla ostatniego commita (amend).
* podróżuj po historii i branchach tylko przy czystym drzewie roboczym 
* zmergowany branch można usunąć 
* fast forward nie zawsze jest możliwy - działa tylko w przypadku gdy jeden branch może "dogonić" drugi
* zawsze można wymusić commit mergujący

Git - przydatne komendy
git status
git add .
git commit -m "[tag] - message"
git restore --staged file-name // zdejmij ze stage'a
git checkout branch-name // przełącz się na branch-name
git checkout -b branch-name // przełącz na nowo utworzony branch
