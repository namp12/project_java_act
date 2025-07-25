# 🛒 Hệ thống Quản lý Hàng Hóa (Java)

## 🔍 Mô tả đề tài
Phần mềm quản lý cửa hàng tạp hóa với các chức năng:
- Quản lý sản phẩm (tên, mã, giá, HSD, số lượng...)
- Ghi nhận giao dịch nhập/xuất hàng
- Tạo hóa đơn, thống kê doanh thu
- Quản lý người dùng với phân quyền (ADMIN, STAFF)
- Cảnh báo hàng sắp hết / sắp hết hạn
- Hỗ trợ lưu trữ bằng JSON hoặc cơ sở dữ liệu (MySQL / SQLite)

Hệ thống hỗ trợ triển khai dạng giao diện console hoặc GUI (JavaFX, Swing).

---

## 🗂️ Cấu trúc thư mục

```plaintext
project/
│
├── model/
│   ├── Product.java
│   ├── User.java
│   ├── Role.java
│   ├── Supplier.java
│   ├── Transaction.java
│   ├── Invoice.java
│   └── Statistics.java
│
├── service/
│   ├── ProductService.java
│   ├── UserService.java
│   ├── AuthService.java
│   ├── TransactionService.java
│   ├── InvoiceService.java
│   ├── StatisticsService.java
│   ├── AlertService.java
│   └── IService.java
│
├── repository/
│   ├── JsonRepository.java
│   ├── ExcelRepository.java
│   ├── UserRepository.java
│   ├── ProductDao.java
│   ├── TransactionDao.java
│   └── FileManager.java
│
├── controller/
│   ├── ProductController.java
│   ├── TransactionController.java
│   ├── LoginController.java
│   ├── StatisticsController.java
│   └── InvoiceController.java
│
├── view/
│   ├── BaseView.java
│   ├── LoginView.java
│   ├── MainView.java
│   ├── ProductView.java
│   ├── TransactionView.java
│   ├── StatisticsView.java
│   ├── InvoiceView.java
│   └── AlertView.java
│
├── ui/
│   ├── ConsoleMenu.java
│   ├── ProductMenu.java
│   └── LoginMenu.java
│
├── util/
│   ├── DateUtil.java
│   ├── InputValidator.java
│   ├── SearchUtil.java
│   ├── ExportUtil.java
│   ├── LoggerUtil.java
│   ├── PermissionUtil.java
│   └── ConfigUtil.java
│
├── config/
│   ├── AppConfig.java
│   └── config.properties
│
├── data/
│   ├── products.json
│   ├── users.json
│   └── transactions.json
│
├── Main.java
└── README.md


---

## 📦 1. `model/` – Lớp dữ liệu & Entity

| File              | Mô tả |
|-------------------|-------|
| `Product.java`     | Sản phẩm: mã, tên, giá, NSX, HSD, số lượng |
| `User.java`        | Người dùng: username, password, role |
| `Role.java`        | Enum quyền: ADMIN, STAFF, VIEWER |
| `Supplier.java`    | Nhà cung cấp: tên, mã, địa chỉ |
| `Transaction.java` | Lịch sử nhập/xuất: sản phẩm, user, thời gian |
| `Invoice.java`     | Hóa đơn: chi tiết giao dịch, tổng tiền |
| `Statistics.java`  | Tóm tắt doanh thu, sản phẩm bán chạy |

---

## ⚙️ 2. `service/` – Logic nghiệp vụ

| File                  | Chức năng |
|-----------------------|-----------|
| `ProductService.java`     | Thêm, sửa, xóa, lọc sản phẩm |
| `UserService.java`        | Quản lý user |
| `AuthService.java`        | Đăng nhập, phân quyền |
| `TransactionService.java` | Nhập / xuất hàng |
| `InvoiceService.java`     | Tạo, lưu và in hóa đơn |
| `StatisticsService.java`  | Báo cáo doanh thu, sản phẩm bán chạy |
| `AlertService.java`       | Cảnh báo hết hàng, hết hạn dùng |
| `IService.java` (interface) | Interface chung cho các service |

---

## 📂 3. `repository/` – Quản lý dữ liệu (JSON / DB)

| File                  | Mô tả |
|-----------------------|------|
| `JsonRepository.java`     | Đọc/ghi JSON (sản phẩm, user, giao dịch...) |
| `ExcelRepository.java`    | Export dữ liệu ra Excel |
| `UserRepository.java`     | Kiểm tra tài khoản đăng nhập |
| `ProductDao.java`         | DAO cho bảng sản phẩm (nếu dùng DB) |
| `TransactionDao.java`     | DAO cho bảng giao dịch |
| `FileManager.java` (interface) | Interface chung cho thao tác lưu trữ |
| `JDBC config files`       | File kết nối DB (JDBC, URL, username, password...) |

---

## 🎮 4. `controller/` – Điều phối dữ liệu

| File                   | Vai trò |
|------------------------|--------|
| `ProductController.java`     | Điều phối dữ liệu sản phẩm |
| `TransactionController.java` | Xử lý nghiệp vụ nhập/xuất hàng |
| `LoginController.java`       | Đăng nhập và phân quyền |
| `StatisticsController.java`  | Trả dữ liệu thống kê ra View |
| `InvoiceController.java`     | Quản lý hóa đơn, in PDF |

---

## 🖥 5. `view/` – Giao diện người dùng (JavaFX / CLI)

| Giao diện         | Mô tả |
|-------------------|------|
| `BaseView.java`       | Layout chung |
| `LoginView.java`      | Màn hình đăng nhập |
| `MainView.java`       | Menu chính sau đăng nhập |
| `ProductView.java`    | Quản lý sản phẩm |
| `TransactionView.java`| Giao diện nhập/xuất hàng |
| `StatisticsView.java` | Báo cáo, biểu đồ doanh thu |
| `InvoiceView.java`    | Xem / In hóa đơn |
| `AlertView.java`      | Cảnh báo sản phẩm sắp hết / hết hạn |

> 📌 Nếu không dùng GUI, thay vào đó bạn có thể dùng:
> - `ConsoleMenu.java`
> - `ProductMenu.java`
> - `LoginMenu.java`
> - …

---

## 🧰 6. `util/` – Tiện ích dùng chung

| File               | Mục đích |
|--------------------|---------|
| `DateUtil.java`        | Định dạng ngày tháng |
| `InputValidator.java`  | Kiểm tra dữ liệu đầu vào |
| `SearchUtil.java`      | Tìm kiếm gần đúng |
| `ExportUtil.java`      | Xuất danh sách ra file |
| `LoggerUtil.java`      | Ghi log hoạt động hệ thống |
| `PermissionUtil.java`  | Phân quyền theo role |
| `ConfigUtil.java`      | Đọc config hệ thống từ file `config.properties` |

---

## ⚙️ 7. `config/` – Thiết lập hệ thống

| File                  | Vai trò |
|-----------------------|--------|
| `AppConfig.java`          | Class cấu hình hệ thống: thư mục lưu, mặc định, chế độ... |
| `config.properties`       | File chứa cấu hình như:  
- Loại lưu trữ (`JSON`, `DB`)  
- Đường dẫn thư mục data  
- DB URL / Username / Password  
- Quyền mặc định người dùng

---

## ▶️ Khởi chạy chương trình

File `Main.java` là điểm khởi chạy toàn hệ thống:

```bash
javac Main.java
java Main
