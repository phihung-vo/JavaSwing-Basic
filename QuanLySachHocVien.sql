USE [master]
GO
/****** Object:  Database [QLSACHVAHOCVIEN]    Script Date: 20/03/2021 5:50:51 AM ******/
CREATE DATABASE [QLSACHVAHOCVIEN]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'QLSACH', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\QLSACH.mdf' , SIZE = 4096KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'QLSACH_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\QLSACH_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QLSACHVAHOCVIEN].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET ARITHABORT OFF 
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET  DISABLE_BROKER 
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET RECOVERY FULL 
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET  MULTI_USER 
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'QLSACHVAHOCVIEN', N'ON'
GO
USE [QLSACHVAHOCVIEN]
GO
/****** Object:  Table [dbo].[HOCVIEN]    Script Date: 20/03/2021 5:50:51 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HOCVIEN](
	[MAHV] [nvarchar](10) NOT NULL,
	[HOTEN] [nvarchar](50) NOT NULL,
	[PHAI] [nvarchar](6) NOT NULL,
	[MATINH] [nvarchar](10) NOT NULL,
	[EMAIL] [nvarchar](100) NOT NULL,
 CONSTRAINT [PK_HOCVIEN] PRIMARY KEY CLUSTERED 
(
	[MAHV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[SACH]    Script Date: 20/03/2021 5:50:51 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SACH](
	[MASACH] [nvarchar](10) NOT NULL,
	[TUASACH] [nvarchar](100) NOT NULL,
	[TACGIA] [nvarchar](50) NOT NULL,
	[NHAXUATBAN] [nvarchar](100) NOT NULL,
 CONSTRAINT [PK_SACH] PRIMARY KEY CLUSTERED 
(
	[MASACH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[TINH]    Script Date: 20/03/2021 5:50:51 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TINH](
	[MATINH] [nvarchar](10) NOT NULL,
	[TENTINH] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_TINH] PRIMARY KEY CLUSTERED 
(
	[MATINH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
INSERT [dbo].[HOCVIEN] ([MAHV], [HOTEN], [PHAI], [MATINH], [EMAIL]) VALUES (N'BCV', N'BVC', N'Nữ', N'1', N'cbv')
INSERT [dbo].[HOCVIEN] ([MAHV], [HOTEN], [PHAI], [MATINH], [EMAIL]) VALUES (N'BVBCV', N'BCVB', N'Nữ', N'1', N'vcb')
INSERT [dbo].[HOCVIEN] ([MAHV], [HOTEN], [PHAI], [MATINH], [EMAIL]) VALUES (N'HV01', N'LE TRUONG GIANG', N'Nam', N'1', N'ltgiang@gmail.com')
INSERT [dbo].[HOCVIEN] ([MAHV], [HOTEN], [PHAI], [MATINH], [EMAIL]) VALUES (N'hv02', N'sdfs', N'Nam', N'0', N'csdd')
INSERT [dbo].[HOCVIEN] ([MAHV], [HOTEN], [PHAI], [MATINH], [EMAIL]) VALUES (N'xcv', N'vxcv', N'Nam', N'0', N'dfs')
INSERT [dbo].[SACH] ([MASACH], [TUASACH], [TACGIA], [NHAXUATBAN]) VALUES (N'DS1', N'Nhung bong hoa nho', N'Nguyen Khoa', N'Kim Dong')
INSERT [dbo].[SACH] ([MASACH], [TUASACH], [TACGIA], [NHAXUATBAN]) VALUES (N'DS2', N'Nguoi cung kho', N'To Huu', N'Lac Viet')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'1', N'An Giang')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'10', N'Bình Phước')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'11', N'Bình Thuận')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'12', N'Cà Mau')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'13', N'Cần Thơ')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'14', N'Cao Bằng ')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'15', N'Đà Nẵng')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'16', N'Đắk Lắk')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'17', N'Đắk Nông')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'18', N'Điện Biên')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'19', N'Đồng Nai')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'2', N'Bà rịa – Vũng tàu')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'20', N'Đồng Tháp')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'21', N'Gia Lai')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'22', N'Hà Giang')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'23', N'Hà Nam')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'24', N'Hà Nội ')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'25', N'Hà Tĩnh')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'26', N'Hải Dương')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'27', N'Hải Phòng')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'28', N'Hậu Giang')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'29', N'Hòa Bình')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'3', N'Bắc Giang')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'30', N'Hưng Yên')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'31', N'Khánh Hòa')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'32', N'Kiên Giang')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'33', N'Kon Tum')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'34', N'Lai Châu')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'35', N'Lâm Đồng')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'36', N'Lạng Sơn')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'37', N'Lào Cai')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'38', N'Long An')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'39', N'Nam Định')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'4', N'Bắc Kạn')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'40', N'Nghệ An')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'41', N'Ninh Bình')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'42', N'Ninh Thuận')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'43', N'Phú Thọ')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'44', N'Phú Yên')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'45', N'Quảng Bình')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'46', N'Quảng Nam')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'47', N'Quảng Ngãi')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'48', N'Quảng Ninh')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'49', N'Quảng Trị')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'5', N'Bạc Liêu')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'50', N'Sóc Trăng')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'51', N'Sơn La')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'52', N'Tây Ninh')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'53', N'Thái Bình')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'54', N'Thái Nguyên')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'55', N'Thanh Hóa')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'56', N'Thừa Thiên Huế')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'57', N'Tiền Giang')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'58', N'Thành phố Hồ Chí Minh')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'59', N'Trà Vinh')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'6', N'Bắc Ninh')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'60', N'Tuyên Quang')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'61', N'Vĩnh Long')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'62', N'Vĩnh Phúc')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'63', N'Yên Bái')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'7', N'Bến Tre')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'8', N'Bình Định')
INSERT [dbo].[TINH] ([MATINH], [TENTINH]) VALUES (N'9', N'Bình Dương')
USE [master]
GO
ALTER DATABASE [QLSACHVAHOCVIEN] SET  READ_WRITE 
GO
