# Wigell Calculator (Java)

Meny-driven kalkylator som körs i loop och hanterar **+  −  ×  ÷**. Division med 0 stoppas. Avsluta med menyval **0**.

## Körning
- Öppna i IntelliJ och kör `Calculator` (grön ▶️).
- Ange två tal separerade med mellanslag; `0 0` i ett räknesätt går tillbaka till menyn.

## Meny
1) Addition  
2) Subtraction  
3) Multiplication  
4) Division  
0) End

## Brancher (en push per feature)
- `feat/addition` – `add(a,b)` och används i case "1"  
- `feat/subtraction` – `sub(a,b)` i case "2"  
- `feat/multiplication` – `mul(a,b)` i case "3"  
- `feat/division` – `div(a,b)` i case "4" + skydd mot /0

Collaborator: **Tomas Wigell** (inbjuden).
