# 🧮 BMI Calculator

Prosta aplikacja napisana w języku **Java** z wykorzystaniem frameworka **Spring Boot** (wersja **Java 17**), która służy do obliczania wskaźnika masy ciała (BMI) oraz automatycznej interpretacji wyników.

---

## 🔌 Obsługa API (Endpointy)

Aplikacja jest bardzo elastyczna i pozwala na przekazywanie parametrów `weight` (waga w kg) oraz `height` (wzrost w cm) na dwa różne sposoby:

### 1. Metoda GET (Query Parameters)
Parametry przekazywane są bezpośrednio w adresie URL. Idealne do szybkiego sprawdzenia w przeglądarce.

* **URL:** `http://localhost:8080/api/bmi/calculate`
* **Przykład zapytania:** `http://localhost:8080/api/bmi/calculate?w=70&h=175`

### 2. Metoda POST (Request Body - JSON)
Parametry przekazywane są bezpiecznie w ciele żądania w formacie JSON. Metoda zalecana do integracji z formularzami i aplikacjami klienckimi (np. Postman).

* **URL:** `http://localhost:8080/api/bmi/calculate`
* **Format dokumentu JSON (Request Body):**
```json
{
  "weight": 70.0,
  "height": 175.0
}
```

---

## 🚀 Funkcje projektu
* **Obliczanie BMI** na podstawie podanego wzrostu oraz wagi.
* **Automatyczna klasyfikacja** wyniku (np. niedowaga, waga prawidłowa, nadwaga).
* Wsparcie dla wielokrotnych metod dostępu (**GET** oraz **POST**).

## 🛠️ Użyte technologie
* **Java 17**
* **Spring Boot 4.1.1**
* **Maven** (zarządzanie zależnościami)

## 💻 Jak uruchomić projekt lokalnie

1. Sklonuj repozytorium na swój komputer:
```bash
git clone https://github.com/Michrzon/bmi-calculator.git
```
2. Wejdź do folderu projektu:
```bash
cd bmi-calculator
```
3. Uruchom aplikację za pomocą Maven Wrapper:
```bash
./mvnw spring-boot:run
```

## 📬 Kontakt
Twórca: [@Michrzon](https://github.com/Michrzon)
