# Child Care Project - TODO List & Roadmap

## 🛠️ Bước 1: Xây dựng tầng Core & Design System (Nền móng)
- [ ] **Theme & Styling (`ui/theme/`)**
  - [ ] Color Palette (Màu pastel xanh, cam nhẹ, tươi sáng & thân thiện cho trẻ em)
  - [ ] Typography & Shape
- [ ] **Reusable UI Components**
  - [ ] `AppButton`
  - [ ] `AppTextField`
  - [ ] `AppCard`
  - [ ] `AppDatePickerDialog` (Chọn ngày sinh, ngày ghi nhận)
  - [ ] `AppTopBar` (Thanh tiêu đề chung cho các màn hình)

## 👶 Bước 2: Thiết lập Database cốt lõi & Quản lý Hồ sơ Bé (`ChildProfile`)
- [ ] **Room Database**
  - [ ] Tạo `ChildProfileEntity`, `ChildProfileDao`, `AppDatabase`
- [ ] **Quản lý Hồ sơ Bé (Add/Edit)**
  - [ ] Screen / Dialog Thêm và Chỉnh sửa thông tin bé (Tên, ngày sinh, giới tính, avatar)
- [ ] **Active Child State**
  - [ ] Lưu trữ & quản lý ID bé đang được chọn (`ActiveChildId`) bằng DataStore / ViewModel toàn cục

## 📈 Bước 3: Module Theo dõi Phát triển (`feature_growth`)
- [ ] **Data Layer**
  - [ ] `GrowthEntity` & `GrowthDao` trong Room
  - [ ] `GrowthRepository`
- [ ] **ViewModel & State**
  - [ ] `GrowthViewModel` & `GrowthUiState` (Danh sách ghi nhận, loading, error)
  - [ ] Hàm `addGrowthRecord(...)`
- [ ] **UI Screens**
  - [ ] Màn hình danh sách lịch sử đo đạc (`LazyColumn`)
  - [ ] Form nhập chiều cao, cân nặng (AlertDialog / BottomSheet)

## 🧭 Bước 4: Hệ thống Navigation
- [ ] **Jetpack Navigation for Compose**
  - [ ] Cấu hình `NavHost`, `NavGraph`, Routes
  - [ ] Điều hướng: Home -> Chi tiết chiều cao/cân nặng -> Thêm bản ghi mới
