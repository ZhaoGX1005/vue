<template>
  <el-container style="height: 100%">
    <el-aside width="auto">
      <common-aside />
    </el-aside>
    <el-container>
      <el-header>Header</el-header>
      <el-main>Main</el-main>
      <el-footer>Footer</el-footer>
    </el-container>
  </el-container>
</template>

<script>
import CommonAside from '../components/CommonAside.vue'

export default {
  comments: {
    CommonAside
  }
}
</script>

<style lang="less" scoped>
.el-header {
  background-color: gray;
}
.el-main{
  padding-top: 0;
}
</style>
